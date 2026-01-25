public class Bonjour {
    public static void main (String [] args) {
        String nom;System.out.println("Bienvenue au cours de programmation 1.");
        System.out.print("Entrez votre nom : ");
        
        nom = Clavier.lireString();
        
        System.out.println("\nBonjour " + nom);
        System.out.println("\nFin normale du programme.");
    }
}