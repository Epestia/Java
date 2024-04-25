import java.util.ArrayList;
import java.util.Scanner;
//Creation class Tableau 
public class Tableau {
    public static void main(String[] args) {
        ArrayList<String> tableau = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez des valeurs (ou tapez QUITTER pour qu'il s'arrête) :");

        while (true) {
            String valeur = scanner.nextLine();
            if (valeur.equals("QUITTER")) {
                break;
            }
            tableau.add(valeur);
        }

        System.out.println("Contenu du tableau :");
        for (String valeur : tableau) {
            System.out.println(valeur);
        }
        System.out.println("Longueur du tableau : " + tableau.size());
    }
}
