public class Calculatrice {

    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();
        System.out.println("2 + 3 = " + c.addition(2, 3));
        System.out.println("5 - 2 = " + c.soustraction(5, 2));
    }
}
