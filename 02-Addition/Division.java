public class Division {
    public static void main(String[] args) {
        try {
            // Code pouvant générer une exception
            int result = divide(10, 0);
            System.out.println("Le résultat de la division est : " + result);
        } catch (ArithmeticException e) {
            // Capture de l'exception ArithmeticException, qui est lancée lorsque la division par zéro est tentée
            System.err.println("Erreur : Division par zéro !");
        }
    }

    public static int divide(int numerator, int denominator) {
        // Tentative de division
        return numerator / denominator;
    }
}
