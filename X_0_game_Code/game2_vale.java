package X_0_game_Code;

import java.util.Scanner;

public class game2_vale {

    public static Scanner gamer_name2 =new Scanner( System.in);
    public static String GAME2_X_Y;
    public static int value2_setir;
    public  static  int value2_sutun;


    public static String X_y_2(){
        System.out.println(" PLAYER_2_ -->  0");
        while(true) {
            GAME2_X_Y = gamer_name2.next();
            if (GAME2_X_Y.equals("0")) return GAME2_X_Y;

            else System.out.println(" Yalniz boyuk  reqem 0 daxil edin ");
        }


    }
    public static int Value2_setir(){
        System.out.println("player 2 setir");

        while (true){
            value2_setir=gamer_name2.nextInt();
            if (value2_setir<=3 && value2_setir>0) return value2_setir-1;
            else System.out.println("3 den boyuk ve 1 kicik olmaz");
        }

    }
    public static int getValue2_sutun(){
        System.out.println(" player 2 sutun ");
        while (true){
            value2_sutun=gamer_name2.nextInt();
            if (value2_sutun<=3 && value2_sutun>0) return value2_sutun-1;
            else System.out.println("3 den boyuk ve 1 kicik olmaz");
        }

    }


}
