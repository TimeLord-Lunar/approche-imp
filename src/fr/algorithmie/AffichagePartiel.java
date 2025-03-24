package fr.algorithmie;

public class AffichagePartiel
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Display only if < 3
        System.out.println("Entiers supérieurs à 3:");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 3)
            {
                System.out.println(array[i]);
            }
        }

        // Display Even Numbers
        System.out.println("\nEntiers pairs:");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println(array[i]);
            }
        }

        // Display Even Index Elements
        System.out.println("\nValeurs aux index pairs:");
        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(array[i]);
            }
        }

        // Display Odd numbers
        System.out.println("\nEntiers impairs:");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                System.out.println(array[i]);
            }
        }
    }
}
