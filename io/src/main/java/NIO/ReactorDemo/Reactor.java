package NIO.ReactorDemo;

import com.sun.corba.se.pept.transport.Acceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * @NAME:Reactor
 * @Desc:递归
 * @author: wupei
 * @date: 2023/8/22
 */
public class Reactor implements Runnable{
    final Selector selector;
    final ServerSocketChannel serverSocketChannel;



    public Reactor(int port)throws IOException {
        selector = Selector.open();
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(port));
        serverSocketChannel.configureBlocking(false);
        SelectionKey key = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        key.attach(new Acceptor());

    }

    public static void main(String[] args) throws IOException{
        new Thread(new Reactor(1234)).start();
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                for (SelectionKey selectionKey : selectionKeys) {
                    dispatch(selectionKey);
                }
                selectionKeys.clear();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void dispatch(SelectionKey selectionKey) {
        Runnable run = (Runnable) selectionKey.attachment();
        if (run != null) {
            run.run();
        }
    }
    class Acceptor implements Runnable {
        @Override
        public void run() {
            try {
                SocketChannel channel = serverSocketChannel.accept();
                if (channel != null) {
                    new Handler(selector, channel);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    class Handler implements Runnable {
        private final static int DEFAULT_SIZE = 1024;
        private final SocketChannel socketChannel;
        private final SelectionKey seletionKey;
        private static final int READING = 0;
        private static final int SENDING = 1;
        private int state = READING;
        ByteBuffer inputBuffer = ByteBuffer.allocate(DEFAULT_SIZE);
        ByteBuffer outputBuffer = ByteBuffer.allocate(DEFAULT_SIZE);
        public Handler(Selector selector, SocketChannel channel) throws IOException
        {
            this.socketChannel = channel;
            socketChannel.configureBlocking(false);
            this.seletionKey = socketChannel.register(selector, 0);
            seletionKey.attach(this);
            seletionKey.interestOps(SelectionKey.OP_READ);
            selector.wakeup();
        }
        @Override
        public void run() {
            if (state == READING) {
                read();
            } else if (state == SENDING) {
                write();
            }
        }
        class Sender implements Runnable {
            @Override
            public void run() {
                try {
                    socketChannel.write(outputBuffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (outIsComplete()) {
                    seletionKey.cancel();
                }
            }
        }
        private void write() {
            try {
                socketChannel.write(outputBuffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (outIsComplete()) {
                seletionKey.cancel();
            }
        }
        private void read() {
            try {
                socketChannel.read(inputBuffer);
                if (inputIsComplete()) {
                    process();
                    System.out.println("接收到来自客户端（" +
                            socketChannel.socket().getInetAddress().getHostAddress()
                            + "）的消息：" + new String(inputBuffer.array()));
                    seletionKey.attach(new Sender());
                    seletionKey.interestOps(SelectionKey.OP_WRITE);
                    seletionKey.selector().wakeup();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public boolean inputIsComplete() {
            return true;
        }
        public boolean outIsComplete() {
            return true;
        }
        public void process() {
// do something...
        }
    }
}