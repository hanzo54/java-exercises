package RecipeCreator;

import java.util.ArrayList;

public class RecipeBook
{
    protected ArrayList<Dish> dishes;
    
    public void addDish(Dish dish)
    {
        dishes.add(dish);
    }

    public void listDishes()
    {
        System.out.println(dishes);
    }

    public void findHealthiestDish()
    {
        for (Dish dish : dishes)
        {
            if(dish.calories < findHealthiestDish.calories)
            {
                findHealthiestDish = dish;
            }
        }
        
    }

}
