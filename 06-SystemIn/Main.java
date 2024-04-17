import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            // Créer un objet Scanner pour lire l'entrée utilisateur
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur d'entrer son nom
            System.out.println("Veuillez entrer votre nom :");

            // Lire le nom de l'utilisateur
            String nom = scanner.nextLine();

            // Afficher un message de salutation avec le nom de l'utilisateur
            System.out.println("Bonjour, " + nom + "! Bienvenue");

            // Fermer le scanner
            scanner.close();
        }
    }

