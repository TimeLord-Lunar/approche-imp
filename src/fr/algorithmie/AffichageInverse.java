package fr.algorithmie;

public class AffichageInverse
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Display Every elements Loop For
        System.out.println("Éléments du tableau dans l'ordre original:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        // Display Every elements in reverse Loop For
        System.out.println("\nÉléments du tableau dans l'ordre inverse:");
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }

        // Copy Every Element
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            arrayCopy[i] = array[i];
        }

        // Display Every Element in the copy
        System.out.println("\nÉléments de arrayCopy:");
        for (int i = 0; i < arrayCopy.length; i++)
        {
            System.out.println(arrayCopy[i]);
        }
    }
}
