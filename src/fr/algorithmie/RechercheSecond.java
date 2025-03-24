package fr.algorithmie;

public class RechercheSecond
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Initialization of the two variables
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Loop to find Biggest and Second Biggest Element
        for (int num : array)
        {
            // If finding bigger than Max, Max become Second, and new Num become Max
            // but if we find bigger than second but lesser than max, new number become Second
            if (num > max)
            {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max)
            {
                secondMax = num;
            }
        }

        // Display Second Biggest Elements
        System.out.println("Le second plus grand élément est : " + secondMax);
    }
}
