package fr.algorithmie;

public class NombreParfait
{
    public static void main(String[] args)
    {
        // Number to test
        int number = 11;

        // Vatriable for keeping the divider
        int sum = 0;

        // Loop of every Divider
        for (int i = 1; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }

        // Verification if number is perfect
        if (sum == number)
        {
            System.out.println(number + " est un nombre parfait.");
        } else
        {
            System.out.println(number + " n'est pas un nombre parfait.");
        }
    }
}
