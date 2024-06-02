package factory;

/**
 * @NAME:FactoryTest
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.getSender(SenderFactory.SMS_SENDER);
        sender.send();

    }
}
