package builder;

/**
 * @NAME:Burger
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
