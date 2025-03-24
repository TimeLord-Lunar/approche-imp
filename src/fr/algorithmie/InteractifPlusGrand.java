package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        // Ask the user for 10 numbers
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("Entrez le nombre " + i + " : ");
            int nombre = scanner.nextInt();

            // Check if the number is the largest encountered
            if (nombre > max)
            {
                max = nombre;
            }
        }

        // Display Biggest Number
        System.out.println("Le plus grand nombre est : " + max);

        scanner.close();
    }
}
