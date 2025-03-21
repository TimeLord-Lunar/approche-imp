package fr.declaration.variable;

public class DeclarationApp
{

    public static void main(String[] args)
    {
        // Variables Define
        byte smallNumber = 10;
        short shortNumber = 200;
        int integerNumber = 1500;
        long longNumber = 100000L;
        float floatNumber = 3.14f;
        double doubleNumber = 2.71828;
        char character = 'A';
        boolean isJavaFun = true;
        String text = "Bonjour, Java !";

        // Display
        System.out.println("byte : " + smallNumber);
        System.out.println("short : " + shortNumber);
        System.out.println("int : " + integerNumber);
        System.out.println("long : " + longNumber);
        System.out.println("float : " + floatNumber);
        System.out.println("double : " + doubleNumber);
        System.out.println("char : " + character);
        System.out.println("boolean : " + isJavaFun);
        System.out.println("String : " + text);


        // Characters String
        String randomString = "Voici le résultat d’un calcul :\n1+5=6";

        // Display with return to line
        System.out.println(randomString);
    }
}
