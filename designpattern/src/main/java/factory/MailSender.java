package factory;

/**
 * @NAME:MailSender
 * @Desc:邮件消息类
 * @author: wupei
 * @date: 2024/4/17
 */
public class MailSender implements Sender{
    public void send() {
        System.out.println("this is MailSender");
    }
}
