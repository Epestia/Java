

package com.mycompany.addition;

import java.util.Scanner;

public class Soustraction {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour obtenir les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le premier nombre
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        // Demander à l'utilisateur d'entrer le deuxième nombre
        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Fermer le scanner car nous avons obtenu toutes les entrées nécessaires
        scanner.close();

        // Soustraction
        int resultat = nombre1 - nombre2;

        // Affichage du résultat
        System.out.println("Le résultat de la soustraction est : " + resultat);
    }
}
