package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a rank N
        System.out.print("Entrez le rang N de Fibonacci : ");
        int N = scanner.nextInt();

        // Check that N is positive
        if (N < 0)
        {
            System.out.println("Le rang doit être un nombre positif !");
        } else
        {
            // Calculation of the number of rank N in Fibonacci
            long result = fibonacci(N);
            System.out.println("Le nombre de rang " + N + " dans la suite de Fibonacci est : " + result);
        }

        scanner.close();
    }

    // Method for calculating the Fibonacci with an iterative approach
    public static long fibonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, temp;

        for (int i = 2; i <= n; i++)
        {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
