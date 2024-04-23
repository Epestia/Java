import java.util.Scanner;

public class PgcdCalculator {
    // Méthode pour calculer le PGCD entre deux nombres
    public static int calculerPGCD(int a, int b) {
        // Tant que les deux nombres sont différents
        while (a != b) {
            // Soustraire le plus petit nombre du plus grand
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        // Le PGCD est l'une des valeurs a ou b, ils sont égaux à ce stade
        return a; // ou return b;
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
