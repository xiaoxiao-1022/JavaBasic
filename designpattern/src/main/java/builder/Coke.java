package builder;

/**
 * @NAME:Coke
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
