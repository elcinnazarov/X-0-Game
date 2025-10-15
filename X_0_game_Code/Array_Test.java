package X_0_game_Code;

public class Array_Test {

    public static boolean yoxla(String[][] arsy,int novbe,String game1_name, String game2_name) {
       // check by diagonal
        if (!arsy[0][0].equals(" ") &&
                arsy[0][0].equals(arsy[1][1]) &&
                arsy[1][1].equals(arsy[2][2])) {

            if (novbe % 2 > 0) System.out.println(game1_name + " Oyuncu qalib geldi");
            else System.out.println(game2_name + " Oyuncu qalib geldi");

            goster(arsy);
            return false;
        }

// Check according to the opposite diagonal
        else if (!arsy[0][2].equals(" ") &&
                arsy[0][2].equals(arsy[1][1]) &&
                arsy[1][1].equals(arsy[2][0])) {

            if (novbe % 2 > 0) System.out.println(game1_name + " Oyuncu qalib geldi");
            else System.out.println(game2_name + " Oyuncu qalib geldi");

            goster(arsy);
            return false;
        }


        for (int i=0;i<arsy.length;i++){
            // check line

            if (!arsy[i][0].equals(" ") &&
                    arsy[i][0].equals(arsy[i][1]) &&
                    arsy[i][1].equals(arsy[i][2])) {

                    if (novbe % 2 > 0) System.out.println(game1_name+" Oyuncu  qalib geldi");
                    else System.out.println(game2_name + " Oyuncu  qalib geldi");

                   goster(arsy);
                    return false; // there is a cempion here.
            }

            // column check
            else if (!arsy[0][i].equals(" ") &&
                    arsy[0][i].equals(arsy[1][i]) &&
                    arsy[1][i].equals(arsy[2][i])) {

                    if (novbe % 2 > 0) System.out.println(game1_name+" Oyuncu 1 qalib geldi");
                    else System.out.println(game2_name+ " Oyuncu 2 qalib geldi");

                    goster(arsy);
                    return false; /* there is a cempion here */
            }


        }
         // draw
          if (novbe==9) {
            System.out.println("Oyun hec- hece bitdi");
            goster(arsy);
            return false;

        }

        /* there are no chempion */
        return true;
    }

    public static   void goster(String [][] array_to_show){
        for (int i=0;i<array_to_show.length;i++){
            for (int j=0;j<array_to_show.length;j++){

                System.out.print(","+array_to_show[i][j]+"," );
            }
            System.out.println(" ");
        }

    }

}
