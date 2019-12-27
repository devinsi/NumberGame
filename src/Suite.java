import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i=debut; i<=fin; ++i){
            int nbre = i;
            int k = 0;
            do {
                if (nbre % 3 != 0) {
                    if (nbre % 4 != 0) {
                        nbre = (nbre - 1);
                        k = k+1;
                    } else {
                        nbre = (nbre / 2);
                        k = k+1;
                    }
                } else {
                    nbre = (nbre+ 4);
                    k = k+1;
                }
            } while (nbre != 0);
            System.out.println( i + " -> " + k);
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
