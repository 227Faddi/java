
/**
 * Write a description of class ConversionSecondes here.
 *
 * @author Serigne Falilou Khouma
 * @version 1.0.0
 */
public class ConversionSecondes {
    public final static int NB_JOURS = 86400;
    public final static int NB_HEURES = 3600;
    public final static int NB_MINUTES = 60;


    public static void main (String [] args) {
        System.out.println("Bienvenue au convertisseur de secondes...");

        boolean repeat = true;

        while (repeat) {
            int secondesInput = -1;

            while (secondesInput < 0) {
                System.out.print("\nEntrez des secondes (0 pour quitter) : ");
                secondesInput = Clavier.lireInt();

                if (secondesInput < 0) {
                    System.out.println("\nEntrée invalide, veuillez entrer un nombre positif.");
                }
            }

            if (secondesInput == 0) {
                repeat = false;
            } else {
                final int jours = secondesInput / NB_JOURS;
                final int heures = (secondesInput % NB_JOURS) / NB_HEURES;
                final int minutes = (secondesInput % NB_HEURES) / NB_MINUTES;
                final int secondes = secondesInput % NB_MINUTES;

                System.out.println("\nRésultat :");
                System.out.println("Jours : " + jours);
                System.out.println("Heures : " + heures);
                System.out.println("Minutes : " + minutes);
                System.out.println("Secondes : " + secondes);
            }
        }

        System.out.println("\nFin du programme. Merci !");
    }
}