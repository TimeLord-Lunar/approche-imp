package fr.algorithmie;

public class Rotation
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {0, 1, 2, 3};

        // Rotation Right
        if (array.length > 1)
        {
            // Keeping Last Element
            int lastElement = array[array.length - 1];
            // Every Element go to Right
            for (int i = array.length - 1; i > 0; i--)
            {
                array[i] = array[i - 1];
            }
            // Last Element -> First
            array[0] = lastElement;
        }

        // Display after Rotation
        System.out.print("Tableau après rotation : ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
