package abstractfactory;

import factory.MailSender;
import factory.Sender;

/**
 * @NAME:MailSenderFactory
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class MailSenderFactory implements Provider{
    public Sender produce() {
        return new MailSender();
    }
}
