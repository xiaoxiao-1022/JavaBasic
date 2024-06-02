package builder;

/**
 * @NAME:VegBurger
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10.0f;
    }

}
