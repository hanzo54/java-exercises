import java.util.Arrays;
import java.util.Scanner;

public class median
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadej počet čísel: ");
        scanner.nextLine();
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Zadej " + (i + 1) + ". číslo: ");
            numbers[i] = scanner.nextDouble();
        }
        Arrays.sort(numbers);
        double median = numbers[n/2];
        System.out.println("Medián: " + median);
        for (int i = 0; i < n; i++)
        {
            double deviation = numbers[i] - median;
            System.out.printf("%.1f se od mediánu odchyluje o %.6f\n", numbers[i], deviation);
        }
    }
}

