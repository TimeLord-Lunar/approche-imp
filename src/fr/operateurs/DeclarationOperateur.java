package fr.operateurs;

public class DeclarationOperateur
{

    public static void main(String[] args)
    {
        // Variables Define
        int a = 10;
        int b = 20;

        // Test &&
        boolean testEt = a > 0 && b < 10;
        System.out.println("Résultat de 'a > 0 && b < 10' : " + testEt);

        // Test ||
        boolean testOu = a > 0 || b < 10;
        System.out.println("Résultat de 'a > 0 || b < 10' : " + testOu);


        // Test Combine Operator
        // // Classical Incrementation
        a = a + 1;
        System.out.println("Valeur de a après 'a = a + 1' : " + a);

        // // Post-fixed Incrementation
        a++;
        System.out.println("Valeur de a après 'a++' : " + a);

        // // Assign Incrementation
        a += 1;
        System.out.println("Valeur de a après 'a += 1' : " + a);

        // Ternaire Operator
        String c = a > 0 ? "a est plus grand que 0" : "a est inférieur à 0";
        System.out.println("Valeur de c : " + c);
    }
}
