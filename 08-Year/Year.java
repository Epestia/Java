import java.util.Scanner;

public class Year {
    
    public static boolean estBissextile(int annee) {
	//Si l'année est multiple de 400 elle est bissextile
        if (annee % 400 == 0) {
            return true;
        } else if (annee % 100 == 0) { //Si l'année est mutiple de 100 mais pas mutiple de 400, elle n'est pas bissextiles 
            return false;
        } else {
            return annee % 4 == 0; //Si l'année est multiple de 4 elle est bissextile
        }
    }
    
    public static boolean dateValide(int jour, int mois, int annee) {
        // Vérification du mois
        if (mois < 1 || mois > 12)
            return false;

        // Vérification du nombre de jour
        int joursDansMois;
        switch (mois) {
            case 1:
                joursDansMois = 31;
                break;
            case 2:
                joursDansMois = estBissextile(annee) ? 29 : 28;
                break;
            case 3:
                joursDansMois = 31;
                break;
            case 4:
                joursDansMois = 30;
                break;
            case 5:
                joursDansMois = 31;
                break;
            case 6:
                joursDansMois = 30;
                break;
            case 7:
                joursDansMois = 31;
                break;
            case 8:
                joursDansMois = 31;
                break;
            case 9:
                joursDansMois = 30;
                break;
            case 10:
                joursDansMois = 31;
                break;
            case 11:
                joursDansMois = 30;
                break;
            case 12:
                joursDansMois = 31;
                break;
            default:
                return false; // Mois invalide
        }

        return jour >= 1 && jour <= joursDansMois;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie de l'année
        System.out.print("Entrez une année : ");
        int annee = scanner.nextInt();

        // Saisie du jour
        System.out.print("Entrez le jour : ");
        int jour = scanner.nextInt();

        // Saisie du mois
        System.out.print("Entrez le mois : ");
        int mois = scanner.nextInt();

        scanner.close();

        if (dateValide(jour, mois, annee)) {
            System.out.println("La date est valide.");
            if (estBissextile(annee)) {
                System.out.println("L'année " + annee + " est une année bissextile.");
            } else {
                System.out.println("L'année " + annee + " n'est pas une année bissextile.");
            }
        } else {
            System.out.println("La date est invalide.");
        }
    }
}

