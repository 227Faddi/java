
/**
 * Write a description of class ConversionMontant here.
 *
 * @author Serigne Falilou Khouma
 * @version 1.0.0
 */
public class ConversionMontant {
    public final static double BILLET_1 = 0.01;
    public final static double BILLET_5 = 0.5;
    public final static double BILLET_10 = 0.10;
    public final static double BILLET_25 = 0.25;

    public static void main (String [] args) {

        System.out.print("Bienvenue au convertisseur de montant...");

        int nombresBillets1Input = -1;
        while (nombresBillets1Input < 0) {
            System.out.print("\nBillets de 1c: ");
            nombresBillets1Input = Clavier.lireInt();

            if (nombresBillets1Input < 0) {
                System.out.println("\nEntrée invalide, veuillez entrer un nombre positif.");
            }
        }

        int nombresBillets5Input = -1;
        while (nombresBillets5Input < 0) {
            System.out.print("\nBillets de 5c: ");
            nombresBillets5Input = Clavier.lireInt();

            if (nombresBillets5Input < 0) {
                System.out.println("\nEntrée invalide, veuillez entrer un nombre positif.");
            }
        }

        int nombresBillets10Input = -1;
        while (nombresBillets10Input < 0) {
            System.out.print("\nBillets de 10c: ");
            nombresBillets10Input = Clavier.lireInt();

            if (nombresBillets10Input < 0) {
                System.out.println("\nEntrée invalide, veuillez entrer un nombre positif.");
            }
        }

        int nombresBillets25Input = -1;
        while (nombresBillets25Input < 0) {
            System.out.print("\nBillets de 25c: ");
            nombresBillets25Input = Clavier.lireInt();

            if (nombresBillets25Input < 0) {
                System.out.println("\nEntrée invalide, veuillez entrer un nombre positif.");
            }
        }

        final double montantBillets1 = BILLET_1 * nombresBillets1Input;
        final double montantBillets5 = BILLET_5 * nombresBillets5Input;
        final double montantBillets10 = BILLET_10 * nombresBillets10Input;
        final double montantBillets25 = BILLET_25 * nombresBillets25Input;

        final double total = montantBillets1 + montantBillets5 + montantBillets10 + montantBillets25;

        System.out.println("\nRésultat: " + total + "$");
        System.out.println("\nFin du programme. Merci !");
    }
}