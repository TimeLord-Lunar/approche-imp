package fr.algorithmie;

public class RechercheMin
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Initialization for lowest elements
        int min = array[0];

        // Looping every elements in array
        for (int i = 1; i < array.length; i++)
        {
            // If lower than previously keeped value : replace
            if (array[i] < min)
            {
                min = array[i];
            }
        }

        // Display lowest elements
        System.out.println("Le plus petit élément du tableau est : " + min);
    }
}
