import java.util.Scanner;

public class FonctionTrig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'angle en degrés : ");
        double angleDeg = scanner.nextDouble();

        // Convertir l'angle de degrés en radians
        double angleRad = Math.toRadians(angleDeg);

        // Calculer le sinus, le cosinus et la tangente
        double sinValue = Math.sin(angleRad);
        double cosValue = Math.cos(angleRad);
        double tanValue = Math.tan(angleRad);

        // Calculer l'arc sinus, l'arc cosinus et l'arc tangente
        double asinValue = Math.toDegrees(Math.asin(sinValue));
        double acosValue = Math.toDegrees(Math.acos(cosValue));
        double atanValue = Math.toDegrees(Math.atan(tanValue));

        // Afficher les résultats
        System.out.println("Sinus de " + angleDeg + " degrés : " + sinValue);
        System.out.println("Cosinus de " + angleDeg + " degrés : " + cosValue);
        System.out.println("Tangente de " + angleDeg + " degrés : " + tanValue);
        System.out.println("Arcsinus de " + sinValue + " : " + asinValue + " degrés");
        System.out.println("Arccosinus de " + cosValue + " : " + acosValue + " degrés");
        System.out.println("Arctangente de " + tanValue + " : " + atanValue + " degrés");

        scanner.close();
    }
}
