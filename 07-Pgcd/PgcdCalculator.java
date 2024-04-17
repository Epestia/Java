import java.util.Scanner;

public class PgcdCalculator {
    // Méthode pour calculer le PGCD entre deux nombres
    public static int calculerPGCD(int a, int b) {
        int min = a;
        if (b < a) {
            min = b;
        }

        int pgcd = 1; // Initialiser le PGCD à 1
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                pgcd = i; // Mettre à jour le PGCD si i divise à la fois a et b
            }
        }
        return pgcd; // Retourner le PGCD trouvé
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les nombres
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        scanner.close();

        // Calculer le PGCD et l'afficher
        int pgcd = calculerPGCD(nombre1, nombre2);
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
    }
}
