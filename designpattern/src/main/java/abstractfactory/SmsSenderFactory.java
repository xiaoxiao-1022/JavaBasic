package abstractfactory;

import factory.Sender;
import factory.SmsSender;

/**
 * @NAME:SmsSenderFactory
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class SmsSenderFactory implements Provider{
    public Sender produce() {

        return new SmsSender();
    }
}
