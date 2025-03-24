package RecipeCreator;

import java.util.HashMap;

public class Dish
{
    protected String name;
    protected HashMap <Ingredient, Double> ingredients = new HashMap<>();
    protected int preparationTime;
    protected String difficulty;
    protected String mealType;


    public Dish (String name, int preparationTime, String difficulty, String mealType)
    {
        this.name = name;
        this.preparationTime = preparationTime;
        this.difficulty = difficulty;
        this.mealType = mealType;
    }

    public void addIngredient (Ingredient ingredient, double grams)
    {
        ingredients.put(ingredient, grams);
    }

    public HashMap<String, Double> calculateTotalNutrition()
    {
        double totalKcal = 0;
        double totalProtein = 0;
        double totalCarbs = 0;
        double totalFats = 0;



        for (Ingredient ingredient : ingredients.keySet())
        {
            totalKcal += ingredient.kcal;
            totalCarbs += ingredient.carbs;
            totalProtein += ingredient.protein;
            totalFats += ingredient.fats;
        }

        HashMap<String, Double> nutrition = new HashMap<>();
        
        nutrition.put("Kcal", totalKcal);
        nutrition.put("Carbs", totalCarbs);
        nutrition.put("Protein", totalProtein);
        nutrition.put("Fats", totalFats);
        
        
        return nutrition;
    }

    public void displayInfo()
    {
        HashMap<String, Double> nutrition = calculateTotalNutrition();
        double kcal = nutrition.get("Kcal");
        double carbs = nutrition.get("Carbs");
        double protein = nutrition.get("Protein");
        double fats = nutrition.get("Fats");


        System.out.println("Name of the dish: " + name);
        System.out.println("Preparation time: " + preparationTime);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Meal type: " + mealType );
        System.out.println("Carbs: " + carbs);
        System.out.println("Fats: " + fats);
        System.out.println("Kcal: " + kcal);
        System.out.println("Protein: " + protein);
    }
}
