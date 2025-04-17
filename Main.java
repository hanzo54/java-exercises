import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 : ");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double diskriminant = b * b - 4 * a * c;
        if  (a == 0)
        {
            System.out.println("Není kvadratická rovnice");
        }
        else if (diskriminant == 0)
        {
            double x = -b / (2 * a);
            System.out.println("Rovnice má jeden kořen x = " + x);
        }
        else if (diskriminant > 0)
        {
            double x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.printf("Rovnice má 2 reálné kořeny x1 = %.6f, x2 = %.6f\n", x1, x2);
        }
        else
        {
            System.out.println("Neexistuje řešení v oblasti reálných čísel");
        }
    }
}
