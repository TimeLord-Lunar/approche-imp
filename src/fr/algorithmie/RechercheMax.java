package fr.algorithmie;

public class RechercheMax
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Initialization for biggest elements
        int max = array[0];

        // Looping every elements in array
        for (int i = 1; i < array.length; i++)
        {
            // If bigger than previously keeped value : replace
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        // Display biggest element
        System.out.println("Le plus grand élément du tableau est : " + max);
    }
}
