package strategy;

/**
 * @NAME:OperationAdd
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class OperationAdd implements Strategy{
    public int doOperation(int a, int b) {
        return a + b;
    }
}
