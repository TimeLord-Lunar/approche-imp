package fr.algorithmie;

public class SommeDeTableauxDiff
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        // Find Smallest
        int length = Math.min(array1.length, array2.length);

        // Create New Array
        int[] sumArray = new int[length];

        // Make the Addition and adding it in new array
        for (int i = 0; i < length; i++)
        {
            sumArray[i] = array1[i] + array2[i];
        }

        // Display Loop Sum new array
        System.out.println("La somme des deux tableaux est : ");
        for (int i = 0; i < sumArray.length; i++)
        {
            System.out.print(sumArray[i] + " ");
        }

        // Add the others
        if (array1.length > array2.length)
        {
            System.out.println("\nLes éléments restants de array1 : ");
            for (int i = length; i < array1.length; i++)
            {
                System.out.print(array1[i] + " ");
            }
        } else if (array2.length > array1.length) {
            System.out.println("\nLes éléments restants de array2 : ");
            for (int i = length; i < array2.length; i++)
            {
                System.out.print(array2[i] + " ");
            }
        }
    }
}
