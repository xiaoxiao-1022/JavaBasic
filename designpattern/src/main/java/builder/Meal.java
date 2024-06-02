package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @NAME:Meal
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public class Meal {
    private List<Item> itemList = new ArrayList<Item>(10);

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
}
