package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        // Asks for a number between 1 and 10
        do
        {
            System.out.print("Veuillez entrer un nombre entre 1 et 10 : ");
            nombre = scanner.nextInt();
        } while (nombre < 1 || nombre > 10);

        // Display number
        System.out.println("Vous avez entré : " + nombre);
        scanner.close();
    }
}
