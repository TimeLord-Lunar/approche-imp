package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreMystere = random.nextInt(100) + 1;
        int essais = 0;
        int nombreUtilisateur = 0;

        System.out.println("Bienvenue dans le jeu Plus ou Moins !");
        System.out.println("Trouvez le nombre mystère entre 1 et 100.");

        // Loop until the user finds the number
        while (nombreUtilisateur != nombreMystere)
        {
            System.out.print("Entrez un nombre : ");
            nombreUtilisateur = scanner.nextInt();
            essais++;

            if (nombreUtilisateur < nombreMystere)
            {
                System.out.println("C'est plus !");
            } else if (nombreUtilisateur > nombreMystere)
            {
                System.out.println("C'est moins !");
            }
        }

        System.out.println("Bravo, vous avez trouvé en " + essais + " coups !");
        scanner.close();
    }
}
