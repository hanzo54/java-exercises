
class Calc
{
    public int scitani (int n1, int n2)
    {
        return n1 + n2;
    }

    public int odecitani(int n1, int n2)
    {
        return n1 - n2;
    }

    public int nasobeni (int n1, int n2)
    {
        return n1 * n2;
    }

    public int deleni (int n1, int n2)
    {
        return n1 / n2;
    }

    public int mocnina (int n1)
    {
        return n1 * n1;
    }

    public double odmocnina (double n1)
    {
        if (n1 > 0)
            {
                return Math.sqrt(n1); 
            }
        else 
            {
                System.out.println("Nemůžeš zadat zápornou hodnotu");
                return 0;
            }
            
    }
}



public class Main
{
    public static void main (String a [])
    {
        Calc obj= new Calc ();
        int v1 = obj.scitani(6,7);
        int v2 = obj.odecitani(13,5);
        int v3 = obj.nasobeni(11,12);
        int v4 = obj.deleni(36,12);
        int v5 = obj.mocnina(225);
        double v6 = obj.odmocnina(625);

        System.out.println(v1 + " " + v2 + " " + v3 + " " + v4 + " " + v5 + " " + v6);

    }
}
