package builder;

/**
 * @NAME:VegBurger
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 8.0f;
    }

}
