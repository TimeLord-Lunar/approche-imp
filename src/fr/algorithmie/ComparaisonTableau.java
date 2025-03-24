package fr.algorithmie;

public class ComparaisonTableau
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        // Initialization for common values
        int count = 0;

        // Compare every Elements
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                // If common value, break to next values of array1
                if (array1[i] == array2[j])
                {
                    count++;
                    break;
                }
            }
        }

        // Display number of common value
        System.out.println("Le nombre d'éléments en commun entre les deux tableaux est : " + count);
    }
}
