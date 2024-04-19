import java.util.Scanner;

public class Choix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choisissez une option :");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choix = scanner.nextInt();
        
        double resultat;
        
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi l'addition.");
                resultat = addition();
                break;
            case 2:
                System.out.println("Vous avez choisi la soustraction.");
                resultat = soustraction();
                break;
            case 3:
                System.out.println("Vous avez choisi la multiplication.");
                resultat = multiplication();
                break;
            case 4:
                System.out.println("Vous avez choisi la division.");
                resultat = division();
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }
        
        System.out.println("Le résultat est : " + resultat);
        
        scanner.close();
    }
    
    public static double addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        System.out.println("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        return nombre1 + nombre2;
    }
    
    public static double soustraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        System.out.println("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        return nombre1 - nombre2;
    }
    
    public static double multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        System.out.println("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        return nombre1 * nombre2;
    }
    
    public static double division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le diviseur : ");
        double diviseur = scanner.nextDouble();
        System.out.println("Entrez le diviseur : ");
        double nombre2 = scanner.nextDouble();
        if (nombre2 == 0) {
            System.out.println("Division par zéro !");
            return 0;
        } else {
            return diviseur / nombre2;
        }
    }
}
