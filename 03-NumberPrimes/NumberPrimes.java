package com.mycompany.numberprimes;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class NumberPrimes {
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

    // Méthode pour vérifier si un nombre est premier
    public static boolean estPremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
}
