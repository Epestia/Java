public class Adder {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Utilisation : java Adder <nombre1> <nombre2>");
        } else {
            int nbr1 = Integer.parseInt(args[0]);
            int nbr2 = Integer.parseInt(args[1]);
            int sum = nbr1 + nbr2;
            System.out.println(nbr1 + " + " + nbr2 + " = " + sum);
        }
    }
}
