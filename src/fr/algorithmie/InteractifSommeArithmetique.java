package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Asks the user for a number
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        // Calculation of the sum of integers from 1 to number
        int somme = 0;
        for (int i = 1; i <= nombre; i++)
        {
            somme += i;
        }

        // Display Result
        System.out.println("La somme des entiers de 1 à " + nombre + " est : " + somme);

        scanner.close();
    }
}
