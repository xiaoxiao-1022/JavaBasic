package strategy;

/**
 * @NAME:Context
 * @Desc:策略模式
 * @author: wupei
 * @date: 2024/4/17
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return strategy.doOperation(a,b);
    }
}
