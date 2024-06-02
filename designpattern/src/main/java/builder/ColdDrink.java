package builder;

/**
 * @NAME:ColdDrink
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public abstract class ColdDrink implements Item{


    @Override
    public Packing packing() {
        return new Bottle();
    }


}
