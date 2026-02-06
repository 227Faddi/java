
/**
 * Write a description of class LaboSelections1A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LaboSelections1B {

    public static final char option1 = 'A';
    public static final char option2 = 'B';
    public static final char option3 = 'Q';

    public static final String MSG_PRESENTATION = "\nEntrez un caractere (" + option1 + ", " + option2 + " ou " + option3 + ") : ";
    public static final String MSG_SUCCESS = "\nVous avez choisi le menu : ";
    public static final String MSG_ERREUR = "\nVotre choix est invalide";

    public static void main () {

        System.out.print(MSG_PRESENTATION);
        char selection = Clavier.lireCharLn();

        if(selection == option1 || selection == option2 || selection == option3){
            System.out.println(MSG_SUCCESS + selection);
        } else {
            System.out.println(MSG_ERREUR);
        }
    }
}