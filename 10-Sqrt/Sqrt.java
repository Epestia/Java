import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le nombre
        System.out.print("Entrez un nombre : ");
        double nombre = scanner.nextDouble();

        // Calculer la racine carrée
        double racineCarree = Math.sqrt(nombre);

        // Afficher le résultat
        System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);

        // Fermer le scanner
        scanner.close();
    }
}
