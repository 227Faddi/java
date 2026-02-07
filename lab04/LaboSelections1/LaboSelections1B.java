
/**
 * Write a description of class LaboSelections1B here.
 *
 * @author Serigne Falilou Khouma
 * @version 1.0.0
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

        switch (selection){
            case option1:
            case option2:
            case option3:
                System.out.println(MSG_SUCCESS + selection);
                break;
            default:
                System.out.println(MSG_ERREUR);
        }
    }
}