package builder;

/**
 * @NAME:BuilderDemo
 * @Desc:
 * @author: Hugo
 * @date: 2024/4/19
 */
public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        System.out.println(meal.getCost());

        MealBuilder chickenMeal = new MealBuilder();
        Meal nonVegMeal = chickenMeal.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());


    }
}
