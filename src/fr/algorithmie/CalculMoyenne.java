package fr.algorithmie;

public class CalculMoyenne
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Initialization Sum value
        int sum = 0;

        // Looping every elements and adding it
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        // Calcul Average
        double moyenne = (double) sum / array.length;

        // Display Average
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
    }
}
