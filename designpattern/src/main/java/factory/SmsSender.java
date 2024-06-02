package factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @NAME:SmsSender
 * @Desc:短信消息类
 * @author: wupei
 * @date: 2024/4/17
 */
public class SmsSender implements Sender{
    public void send() {
        System.out.println("this is SmsSender");
    }
}
