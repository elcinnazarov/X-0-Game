package X_0_game_Code;

import java.util.Scanner;

public  class game1_value {
    public static Scanner gamer_name1 =new Scanner( System.in);
   public static String GAME1_X_Y;
    public static int value1_setir;
     public  static  int value1_sutun;


    public static String X_y_1(){
        System.out.println("PLAYER_1 -> X ");
        while(true) {
            GAME1_X_Y = gamer_name1.next();
            if (GAME1_X_Y.equals("X")) return GAME1_X_Y;

             else System.out.println(" Yalniz boyuk X  daxil edin ");
        }

    }
    public static int Value1_setir(){
        System.out.println("player 1 setir");

        while (true){
            value1_setir=gamer_name1.nextInt();
        if (value1_setir<=3 && value1_setir>0) return value1_setir-1;
         else System.out.println("3 den boyuk ve 1 kicik olmaz");
    }


}
    public static int getValue1_sutun(){
        System.out.println(" player 1 sutun ");
        while (true){
            value1_sutun=gamer_name1.nextInt();
            if (value1_sutun<=3 && value1_sutun>0) return value1_sutun-1;
            else System.out.println("3 den boyuk ve 1 kicik olmaz");
        }

    }


}
