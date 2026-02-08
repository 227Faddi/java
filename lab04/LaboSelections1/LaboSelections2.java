
/**
 * Write a description of class LaboSelections2 here.
 *
 * @author Serigne Falilou Khouma
 * @version 1.0.0
 */
public class LaboSelections2 {

    public static final String MSG_PRESENTATION = "\nEntrez un nombre entier : ";

    public static final String MSG_IMPAIR = "\nLe nombre est impair";
    public static final String MSG_PAIR = "\nLe nombre est pair";
    public static final String MSG_DEUX_CHIFFRES = "\nLe nombre a deux chiffres";
    public static final String MSG_TROIS_CHIFFRES = "\nLe nombre a trois chiffres ou plus";
    public static final String MSG_MULTIPLE_10 = "\nLe nombre est un multiple de 10";

    public static final String MSG_ERREUR = "\nNombre refuse !";

    public static void main () {

        System.out.print(MSG_PRESENTATION);
        int nombre = Clavier.lireInt();

        if(nombre >= 0){
            if(nombre % 2 == 0){
                System.out.print(MSG_PAIR);
            } else {
                System.out.print(MSG_IMPAIR);
            }

            if(nombre % 10 == 0){
                System.out.print(MSG_MULTIPLE_10);
            }

            if(nombre > 99){
                System.out.print(MSG_TROIS_CHIFFRES);
            } else if(nombre > 9) {
                System.out.print(MSG_DEUX_CHIFFRES);
            }
        } else {
            System.out.println(MSG_ERREUR);
        }
    }
}