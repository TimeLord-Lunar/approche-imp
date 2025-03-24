package fr.algorithmie;

public class InversionContenu
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Copy Array in reverse order
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        // Display element Array
        System.out.println("Éléments du tableau array (original) :");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        // Display Element Copy Array
        System.out.println("\nÉléments du tableau arrayCopy (inversé) :");
        for (int i = 0; i < arrayCopy.length; i++)
        {
            System.out.println(arrayCopy[i]);
        }
    }
}
