package abstractfactory;

import factory.Sender;

/**
 * @NAME:Provider
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public interface Provider {

    public Sender produce();
}
