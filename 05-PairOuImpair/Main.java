import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        // Demander à l'utilisateur de saisir un entier
        System.out.print("Entrez un entier : ");
        byte nombre = scanner.nextByte();
        // Vérifier si l'entier est pair ou impair en utilisant l'opérateur modulo (%)
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est un nombre pair.");
        } else {
            System.out.println(nombre + " est un nombre impair.");
        }
        // Fermer le scanner
        scanner.close();
        int var1 = 7;
        System.out.println(++var1);
        System.out.println(var1++);
    }
}
