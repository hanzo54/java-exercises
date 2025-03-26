package RecipeCreator;

public class Ingredient
{
    protected String name;
    protected double kcal;
    protected double carbs;
    protected double protein;
    protected double fats;
    protected boolean vegan;
    protected boolean keto;
    protected boolean highProtein;
    
    public Ingredient (String name, double kcal, double carbs, double proteins, double fats, boolean vegan, boolean keto, boolean highProtein)
    {
        this.name = name;
        this.kcal = kcal;
        this.carbs = carbs;
        this.protein = proteins;
        this.fats = fats;
        this.vegan = vegan;
        this.keto = keto;
        this.highProtein = highProtein;
    }


    public void displayInfo()
    {
        System.out.println("Show me the nutrional value" + " " +kcal + " " + carbs + " " + protein + " " + fats + " " + "per 100g");
    }
}
