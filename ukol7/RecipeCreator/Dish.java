package RecipeCreator;

import java.util.HashMap;

public class Dish
{
    protected String name;
    protected HashMap <Ingredient, Double> ingredients;
    protected int preparationTime;
    protected String difficulty;
    
    protected double totalKcal;
    protected double totalCarbs;
    protected double totalProtein;
    protected double totalFats;

    public Dish (String name, HashMap<Ingredient, Double> ingredients, int preparationTime, String difficulty)
    {
        this.name = name;
        this.preparationTime = preparationTime;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
    }

    public void addIngredient (Ingredient ingredient, double grams)
    {
        addIngredient(ingredient, grams);
    }

    public void calculateTotalNutrition()
    {
        double totalKcal = 0;
        double totalProtein = 0;
        double totalCarbs = 0;
        double totalFats = 0;

        for (Ingredient key : ingredients.keySet())
        {
            totalKcal += ingredient.kcal;
            totalCarbs += ingredient.carbs;
            totalProtein += ingredient.protein;
            totalFats += ingredient.fats;
        }
    }

    public void displayInfo()
    {
        System.out.println("Dish" + name + preparationTime + difficulty + totalCarbs + totalFats + totalKcal + totalProtein);
    }
}
