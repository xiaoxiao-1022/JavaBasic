package strategy;

/**
 * @NAME:OperationAdd
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class OperationSubtract implements Strategy{
    public int doOperation(int a, int b) {
        return a -b;
    }
}
