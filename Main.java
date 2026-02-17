public class Main {
    public static void main () {
        String mot;
        int nombre;

        System.out.print("Entrez un car: ");
        mot = Clavier.lireString();
        System.out.print("Entrez un nombre: ");
        nombre = Clavier.lireInt();

        System.out.println("Le car saisi est: " + mot + " Nombre: " + nombre);

        System.out.print("Entrez un autre car: ");
        mot = Clavier.lireString();
        System.out.println("Le car saisi est: " + mot);
    }
}