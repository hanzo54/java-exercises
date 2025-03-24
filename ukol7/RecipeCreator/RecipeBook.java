package RecipeCreator;

import java.util.ArrayList;

public class RecipeBook
{
    protected ArrayList<Dish> dishes = new ArrayList<>();
    
    
    
    public void addDish(Dish dish)
    {
        dishes.add(dish);
    }

    public void listDishes()
    {
        for(Dish dish : dishes)
        {
            System.out.println(dish.name + " " + dish.mealType);
        }
    }

    public void findHealthiestDish()
    {
        Dish healthiestDish = dishes.get(0);
        
        for (Dish dish : dishes)
        {
            if(healthiestDish.calculateTotalNutrition().get("Kcal") > dish.calculateTotalNutrition().get("Kcal"))  //method chaining
            {
                healthiestDish = dish;
            }
        }

        System.out.println(healthiestDish.name);
        
    }

}
