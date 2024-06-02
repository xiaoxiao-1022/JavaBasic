package strategy;

/**
 * @NAME:StrategyTest
 * @Desc:在策略模式（Strategy Pattern）中一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 *
 * 在策略模式定义了一系列算法或策略，并将每个算法封装在独立的类中，使得它们可以互相替换。通过使用策略模式，可以在运行时根据需要选择不同的算法，而不需要修改客户端代码。
 *
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * @author: wupei
 * @date: 2024/4/17
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context operationAddContext = new Context(new OperationAdd());
        System.out.println(operationAddContext.execute(1, 2));

        Context operationSubtractContext = new Context(new OperationSubtract());
        System.out.println(operationSubtractContext.execute(1, 2));

        Context operationMultiplyContext = new Context(new OperationMultiply());
        System.out.println(operationMultiplyContext.execute(1, 2));
    }
}
