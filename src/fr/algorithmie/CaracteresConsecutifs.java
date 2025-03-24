package fr.algorithmie;

public class CaracteresConsecutifs
{
    public static void main(String[] args)
    {
        // String
        String input = "aaabbc";

        // Variable for the stocked character
        StringBuilder result = new StringBuilder();

        // Count of repetition
        int count = 1;

        // Loop character string
        for (int i = 0; i < input.length(); i++)
        {
            // If character is not the last and next is the same
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1))
            {
                count++;
            } else
            {
                result.append(input.charAt(i));
                result.append(count);
                count = 1;
            }
        }

        // Display Result
        System.out.println("Chaîne transformée : " + result.toString());
    }
}
