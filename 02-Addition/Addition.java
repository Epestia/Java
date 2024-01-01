

package com.mycompany.addition;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le premier nombre
        System.out.print("Entrez le premier nombre : ");
        double premierNombre = scanner.nextDouble();

        // Demander à l'utilisateur de saisir le deuxième nombre
        System.out.print("Entrez le deuxième nombre : ");
        double deuxiemeNombre = scanner.nextDouble();

        // Calculer la somme des deux nombres
        double somme = premierNombre + deuxiemeNombre;

        // Afficher le résultat
        System.out.println("La somme de " + premierNombre + " et " + deuxiemeNombre + " est : " + somme);

        // Fermer le scanner
        scanner.close();
    }
}
