
class Rekurzivita
{
    public int add(int n)
    {
    if (n == 0)
    {
        return 0;
    }
    return n + add(n-1);
    }
}



public class Main
{
    public static void main(String[] args)
    {
        Rekurzivita rekurzivita = new Rekurzivita();
        
        int result = rekurzivita.add(10);
        System.out.println(result);
    }    
    
}
