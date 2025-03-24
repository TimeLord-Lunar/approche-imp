package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Asks the user for a number
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        // Display the next 10 numbers
        System.out.print("Les 10 nombres suivants sont : ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print((nombre + i) + " ");
        }

        scanner.close();
    }
}
