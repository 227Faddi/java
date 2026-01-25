
/**
 * Write a description of class ConversionSecondes here.
 *
 * @author Serigne Falilou Khouma
 * @version 1.0.0
 */
public class ConversionSecondes{
    public static void main (String [] args) {
        final int NB_JOURS = 86400;
        final int NB_HEURES = 3600;
        final int NB_MINUTES = 60;
        final int NB_SECONDES = 60;
        
        String nom;System.out.println("Bienvenue au cours de programmation 1.");
        System.out.print("Entrez votre nom : ");
        
        nom = Clavier.lireString();
        
        System.out.println("\nBonjour " + nom);
        System.out.println("\nFin normale du programme.");
    }
}