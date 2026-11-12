public class Calculatrice {

    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();
        System.out.println("2 + 3 = " + c.addition(2, 3));
        System.out.println("5 - 2 = " + c.soustraction(5, 2));
        System.out.println("4 * 3 = " + c.multiplication(4, 3));
        System.out.println("10 / 2 = " + c.division(10, 2));

        // Test de la division par zéro
        try {
            c.division(10, 0);
            System.out.println("ERREUR : l'exception n'a pas été levée");
        } catch (ArithmeticException e) {
            System.out.println("Test division par zéro OK : " + e.getMessage());
        }
    }
}
