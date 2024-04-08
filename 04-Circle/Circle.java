
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        // Déclaration de la variable pour stocker le rayon du cercle
        double rayon;

        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le rayon du cercle
        System.out.print("Entrez le rayon du cercle : ");
        rayon = scanner.nextDouble();

        // Calcul de l'aire du cercle
        double aire = Math.PI * rayon * rayon;

        // Affichage du résultat
        System.out.println("L'aire du cercle avec un rayon de " + rayon + " est : " + aire);

        // Fermeture du scanner
        scanner.close();
        System.out.println(Math.PI);
    }
}
