import RecipeCreator.*;

public class Main
{
    public static void main (String[]args)
    {
        Ingredient chicken = new Ingredient("Chicken", 165, 0, 31, 3.6);
        Ingredient lettuce = new Ingredient("Lettuce", 8, 1.3, 0, 0.1);
        Ingredient oliveOil = new Ingredient("Olive oil", 88, 0, 0, 10);

        Dish salad = new Dish("Salad",30, "Easy", "Lunch");
        salad.addIngredient(chicken, 150);
        salad.addIngredient(lettuce, 50);
        salad.addIngredient(oliveOil, 10);

        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addDish(salad);

        recipeBook.listDishes();

        recipeBook.findHealthiestDish();

        
        salad.displayInfo();
    }
}
