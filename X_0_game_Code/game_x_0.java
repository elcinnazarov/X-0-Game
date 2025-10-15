package X_0_game_Code;

import X_0_game_Code.Array_Test;
import X_0_game_Code.game1_value;
import X_0_game_Code.game2_vale;

import java.util.Scanner;

public class game_x_0 {

    public static String[][] lovhe = {{" "," "," "}, {" "," "," "}, {" "," "," "}};
    public static Scanner gamer_name = new Scanner(System.in);

    public static void main(String[] args) {



        boolean gamestart = true;


        while (gamestart) {
            System.out.println("Oyna baslayaq yoxsa yox? yes - V buton  NO- X buton");

            String game_Start = gamer_name.next();
            if (game_Start.contains("X")) {
                System.out.println(" THE GAME IS OVER ");
                break;

            }
            System.out.println("************ GAME START ***************");
            System.out.println(" import  Gamer1 name ");
             String game1_name = gamer_name.next();
            System.out.println("import Gamer2 name");
            String game2_name = gamer_name.next();
            game_start_level2(game1_name,game2_name);

        }


    }

    public static void game_start_level2(String game1_name,String game2_name) {
        boolean qelebe = true;
        int novbe = 1;
        while (qelebe) {
            // SCREEN ON SCREEN

              Array_Test.goster(lovhe);

            // VALUE1 AND VAULE2 PARAMETR IMPORT
            if (novbe % 2 > 0) {

                values_Write(game1_value.getValue1_sutun(),
                        game1_value.Value1_setir(),
                        game1_value.X_y_1(), novbe);
                        qelebe = Array_Test.yoxla(lovhe, novbe,game1_name,game2_name);
                        novbe++;
            } else {

                values_Write(game2_vale.getValue2_sutun(),

                        game2_vale.Value2_setir(),
                        game2_vale.X_y_2(), novbe);
                        qelebe = Array_Test.yoxla(lovhe, novbe,game1_name,game2_name);
                         novbe++;

            }


        }


    }

    public static void values_Write(int comingValue_sutun, int comValue_setir, String X_and_Y, int novbe) {
        if (lovhe[comingValue_sutun][comValue_setir].equals(" ")) {
            lovhe[comingValue_sutun][comValue_setir] = X_and_Y;
        } else {
            System.out.println("daxil etdiyiniz yer dolub");
            System.out.println("yeniden daxil edin");

            //*** Recursiya *****
            if (novbe % 2 > 0) values_Write(
                    game1_value.getValue1_sutun(),
                    game1_value.Value1_setir(),
                    game1_value.X_y_1(), novbe);
            else {
                values_Write(game2_vale.getValue2_sutun(),

                        game2_vale.Value2_setir(),
                        game2_vale.GAME2_X_Y, novbe);

            }

        }


    }


}
