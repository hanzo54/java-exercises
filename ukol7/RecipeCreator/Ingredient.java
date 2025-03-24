package RecipeCreator;

public class Ingredient
{
    protected String name;
    protected double kcal;
    protected double carbs;
    protected double protein;
    protected double fats;
    
    public Ingredient (String name, double kcal, double carbs, double proteins, double fats)
    {
        this.name = name;
        this.kcal = kcal;
        this.carbs = carbs;
        this.protein = proteins;
        this.fats = fats;
    }


    public void displayInfo()
    {
        System.out.println("Show me the nutrional value" + " " +kcal + " " + carbs + " " + protein + " " + fats + " " + "per 100g");
    }
}
