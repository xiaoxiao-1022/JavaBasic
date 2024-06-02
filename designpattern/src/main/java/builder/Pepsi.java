package builder;

/**
 * @NAME:Coke
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
