package fr.algorithmie;

public class FabriquerMur
{
    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur)
    {
        // Maximum number of 5m bricks that can be used without exceeding the length
        int maxBigUsed = Math.min(nbBig, longueur / 5);

        // Remaining length to be completed with 1m bricks
        int reste = longueur - (maxBigUsed * 5);

        // Checking if we have enough 1m bricks to complete the wall
        return reste <= nbSmall;
    }

    public static void verifier(int nbSmall, int nbBig, int longueur, boolean attendu)
    {
        boolean resultat = fabriquerMur(nbSmall, nbBig, longueur);
        System.out.println("[" + nbSmall + "x1m, " + nbBig + "x5m] Mur de " + longueur + "m : "
                + (resultat == attendu ? "✅ OK" : "❌ ERREUR"));
    }

    public static void main(String[] args)
    {
        // Tests to verify the correct functioning of the algorithm
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 1, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }
}
