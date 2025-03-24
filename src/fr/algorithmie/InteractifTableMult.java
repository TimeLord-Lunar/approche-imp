package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult
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

        // Display the multiplication table
        System.out.println("Table de " + nombre + " :");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(nombre + " * " + i + " = " + (nombre * i));
        }

        scanner.close();
    }
}