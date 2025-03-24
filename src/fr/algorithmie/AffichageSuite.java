package fr.algorithmie;

public class AffichageSuite
{
    public static void main(String[] args)
    {
        // Display from 1 to 10 Loop For
        System.out.println("Nombres de 1 à 10 (for):");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        // Display even number from 0 to 10 Loop For
        System.out.println("\nNombres pairs entre 0 et 10 (for):");
        for (int i = 0; i <= 10; i += 2)
        {
            System.out.println(i);
        }

        // Display odd number from 0 to 9 Loop For
        System.out.println("\nNombres impairs entre 0 et 9 (for):");
        for (int i = 1; i < 10; i += 2)
        {
            System.out.println(i);
        }

        // Display from 1 to 10 Loop While
        System.out.println("\nNombres de 1 à 10 (while):");
        int j = 1;
        while (j <= 10)
        {
            System.out.println(j);
            j++;
        }

        // Display even number from 0 to 10 Loop While
        System.out.println("\nNombres pairs entre 0 et 10 (while):");
        int k = 0;
        while (k <= 10)
        {
            System.out.println(k);
            k += 2;
        }

        // Display odd number from 0 to 9 Loop While
        System.out.println("\nNombres impairs entre 0 et 9 (while):");
        int l = 1;
        while (l < 10)
        {
            System.out.println(l);
            l += 2;
        }
    }
}
