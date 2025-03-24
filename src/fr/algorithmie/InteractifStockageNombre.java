package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifStockageNombre
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] nombres = new int[5];
        int count = 0;

        while (true)
        {
            // Menu display
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();

            switch (choix)
            {
                case 1:
                    System.out.print("Entrez un nombre : ");
                    int nombre = scanner.nextInt();

                    // Enlarge the table if full
                    if (count == nombres.length)
                    {
                        nombres = Arrays.copyOf(nombres, nombres.length * 2);
                    }

                    nombres[count++] = nombre;
                    System.out.println("Nombre ajouté avec succès !");
                    break;

                case 2:
                    if (count == 0)
                    {
                        System.out.println("Aucun nombre enregistré.");
                    } else
                    {
                        System.out.print("Nombres enregistrés : ");
                        for (int i = 0; i < count; i++)
                        {
                            System.out.print(nombres[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Fin du programme.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
    }
}
