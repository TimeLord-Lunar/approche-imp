package fr.algorithmie;

public class FirstLast6
{
    public static void main(String[] args)
    {
        // Define Array
        int[] array = {6, 3, 4, 5, 6};

        // Verification for boolean
        boolean result = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);

        // Display Result
        System.out.println("Le résultat est : " + result);
    }
}
