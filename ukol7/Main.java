import RecipeCreator.Ingredient;

public class Main
{
    public static void main (String[]args)
    {
        Ingredient chicken = new Ingredient("Chicken", 165, 0, 31, 3.6);
        Ingredient lettuce = new Ingredient("Lettuce", 8, 1.3, 0, 0.1);
        Ingredient oliveOil = new Ingredient("Olive oil", 88, 0, 0, 10);

        HashMap<Ingredient, Double> ingredients = new HashMap<>();
        ingredients.put(chicken, 150);
        ingredients.put(lettuce, 50);
        ingredients.put(oliveOil, 10);
        
    }
    
}
