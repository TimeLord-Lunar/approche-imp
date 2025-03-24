package fr.algorithmie;

public class FirstLast
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {6, 3, 4, 5, 6};

        // Verification for boolean
        boolean result = array.length >= 1 && array[0] == array[array.length - 1];

        // Display Result
        System.out.println("Le résultat est : " + result);
    }
}
