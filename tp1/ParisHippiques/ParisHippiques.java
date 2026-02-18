/**
 * Write a description of class ParisHippiques here.
 *
 * @author Serigne Falilou Khouma
 * @version 1.0.0
 */
public class ParisHippiques {

    public static final char OPTION_1 = '1';
    public static final char OPTION_2 = '2';
    public static final char OPTION_3 = '3';

    // Messages de démarrage
    public static final String MSG_PRESENTATION = "\nCe programme permet de placer des paris sur des courses hippiques virtuelles.";
    public static final String MSG_BANQUE_VIDE = "\nVotre banque est vide.";
    public static final String MSG_DEPOT = "\nPour continuer, entrez un montant a mettre en banque (0 pour quitter) : ";
    public static final String MSG_FIN = "\nAUREVOIR!";

    // Menu principal
    public static final String MENU = "\n----\nMENU\n----\n1. Placer un pari\n2. Gerer la banque\n3. Quitter";
    public static final String MENU_CHOIX = "\nEntrez votre choix : ";

    public static final String ERR_MONTANT = "\nErreur, le montant doit etre plus grand ou egal a 0! Recommencez...";
    public static final String ERR_CHOIX_MENU = "\nErreur, entrez un choix entre 1 et 3! Recommencez...";

    public static void main (String[] args) {
        float banqueBalance = 0;
        float montantDepot;
        char choixMenu;

        System.out.println(MSG_PRESENTATION);

        System.out.print(MSG_BANQUE_VIDE);
        System.out.print(MSG_DEPOT);
        montantDepot = Clavier.lireInt();

        while (montantDepot <= 0){

            if(montantDepot == 0){
                System.out.print(MSG_FIN);
                return;
            }

            System.out.println(ERR_MONTANT);

            System.out.print(MSG_BANQUE_VIDE);
            System.out.print(MSG_DEPOT);
            montantDepot = Clavier.lireInt();
        }

        banqueBalance += montantDepot;



        System.out.println(MENU);
        System.out.print(MENU_CHOIX);
        choixMenu = Clavier.lireCharLn();

        while (choixMenu != OPTION_1 && choixMenu != OPTION_2) {

            if(choixMenu == OPTION_3){
                System.out.print(MSG_FIN);
                return;
            }

            System.out.println(ERR_CHOIX_MENU);

            System.out.println(MENU);
            System.out.print(MENU_CHOIX);
            choixMenu = Clavier.lireCharLn();
        }

        System.out.print(banqueBalance);

    }
}



// utiliser la class executerCourse
// une seul methode


// Le programme débute en présentant brièvement le logiciel

// signale ensuite que votre banque est vide, et qu’il faut y déposer un montant avant de pouvoir parier

// valider montant | nombre réel >= 0, si 0 terminer le programme

// si est plus grand que 0 afficher le menu principal

        /* MENU
        1. Placer un pari
        2. Gerer la banque
        3. Quitter
        Entrez votre choix :
         */

// valider choix du menu | don't crash on non numbers
// use char

// OPTION 1
// pari, valider le type
// if 5 return to previous menu

// for 1 or 2 : show list of horse and validate numbers (int)
// for 3 or 4 : show list and ask first one, then show list again and ask (int)
// ask for money in réel (float) >= 0 and <= bank money
// si 0 go back to main menu

// show result of the