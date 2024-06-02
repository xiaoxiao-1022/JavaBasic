package abstractfactory;

import factory.Sender;

/**
 * @NAME:AbstractFactoryTest
 * @Desc:抽象工厂模式与工厂模式相比增加多个抽象工厂类，这样做的好处是，不需要再变动历史代码
 * @author: wupei
 * @date: 2024/4/17
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MailSenderFactory mailSenderFactory = new MailSenderFactory();
        Sender produce = mailSenderFactory.produce();
        produce.send();

    }
}
