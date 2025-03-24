package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batons = 21;
        boolean tourJoueur = random.nextBoolean();

        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Règle : Prenez entre 1 et 3 bâtons. Celui qui prend le dernier bâton PERD.");
        System.out.println("Début du jeu !");

        while (batons > 0)
        {
            System.out.println("\nBâtons restants : " + batons);

            int prise;
            if (tourJoueur)
            {
                // Player Turn
                do
                {
                    System.out.print("Combien de bâtons prenez-vous ? (1, 2 ou 3) : ");
                    prise = scanner.nextInt();
                } while (prise < 1 || prise > 3 || prise > batons); // Vérification de la validité du choix
            } else
            {
                // AI Turn
                prise = strategieGagnante(batons);
                System.out.println("L'ordinateur prend " + prise + " bâtons.");
            }

            batons -= prise;

            // Check if the game is over
            if (batons == 0)
            {
                if (tourJoueur)
                {
                    System.out.println("Oh non... Vous avez pris le dernier bâton ! Vous avez perdu.");
                } else
                {
                    System.out.println("Bravo ! L'ordinateur a pris le dernier bâton. Vous avez gagné !");
                }
                break;
            }

            // Change actual player turn
            tourJoueur = !tourJoueur;
        }

        scanner.close();
    }


     // Winning strategy: The computer tries to leave a multiple of 4 sticks.

    public static int strategieGagnante(int batons)
    {
        int prise = (batons - 1) % 4;
        return (prise == 0 || prise > 3) ? new Random().nextInt(Math.min(batons, 3)) + 1 : prise;
    }
}
