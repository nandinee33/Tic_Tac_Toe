/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: nandinee33
 *   Date: 13/10/20
 *   Time: 1:21 PM
 */

import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int player1 = 0;
        int player2 = 0;
        char ch;

        System.out.println();
        System.out.print("                                                    " + "                           " + "--------------------------------------");
        System.out.println();
        System.out.print("                                                    " + "                           " + "WELCOME TO THE MY GAME ZONE");
        System.out.println();
        System.out.print("                                                    " + "                           " + "--------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("GAME NAME : Tic-Tac-Toe");
        System.out.println();

        // Ask the user if user wants to play the game or not
        System.out.print("WOULD YOU LIKE TO PLAY THE GAME? Y/N : ");
        String str1 = sc.nextLine();
        String str2 = str1.toUpperCase();
        if (str2.length() == 1 && str2.charAt(0) == 'Y') {
            System.out.println();
        }

    }
}
