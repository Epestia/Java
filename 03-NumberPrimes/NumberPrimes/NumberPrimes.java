import java.util.Scanner;

public class NumberPrimes {
    // Méthode pour vérifier si un nombre est premier
    public static boolean estPremier(int nombre) {
        // Vérifie si le nombre est inférieur ou égal à 1
        if (nombre <= 1) {
            return false; // S'il est inférieur ou égal à 1, il n'est pas premier
        }
        
        // Boucle pour tester la divisibilité du nombre par les entiers de 2 jusqu'à la valeur où i*i est plus grand que nombre
        for (int i = 2; i * i <= nombre; i++) {
            // Vérifie si le nombre est divisible par i
            if (nombre / i * i == nombre) {
                return false; // S'il est divisible, le nombre n'est pas premier
            }
        }
        
        return true; // Si aucun diviseur n'a été trouvé, le nombre est premier
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        if (estPremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
        scanner.close();
    }
}
