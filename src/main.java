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

            System.out.print("PLAYER 1 NAME : ");
            String abc = sc.nextLine();
            System.out.println();

            System.out.print("PLAYER 2 NAME : ");
            String xyz = sc.nextLine();
            System.out.println();
            System.out.println();

            System.out.print("Chances : ");
            int s = sc.nextInt();

            for (int r = 0; r < s; r++) {
                int count = 0;
                char[][] arr = {{'|', ' ', ' ', ' ', '|'}, {'|', ' ', ' ', ' ', '|'}, {'|', ' ', ' ', ' ', '|'}};
                System.out.println("                           " + "----------------------");
                System.out.println("                           " + "WELCOME TO Tic-Tac-Toe");
                System.out.println("                           " + "----------------------");
                System.out.println("GAME RULE : Always enter two space separated single digit coordinates.");

                System.out.println("---------");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("---------");

                for (int k = 0; k < 9; k++) {
                    System.out.println();
                    count = count % 2;
                    int x = count + 1;
                    if (count == 0) {
                        ch = 'X';
                        System.out.print(player1 + " : ");
                    } else {
                        ch = '0';
                        System.out.print(player2 + " : ");
                    }

                    System.out.print("Coordinates :->> ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    // check for the correct coordinates
                    if (a > 0 && b > 0 && a < 4 && b < 4) {
                        if (arr[2 - (b - 1)][a] == ' ') {
                            arr[2 - (b - 1)][a] = ch;
                            count++;
                            System.out.println("---------");
                            for (int p = 0; p < 3; p++) {
                                for (int q = 0; q < 5; q++) {
                                    System.out.print(arr[p][q] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println("---------");
                        } else {
                            System.out.println("******** The coordinates were already entered, please enter again ********");
                            k--;
                        }
                    } else {
                        System.out.println();
                        System.out.println(" ******** You have Entered wrong coordinates, please enter again ********");
                        k--;
                    }

                    if ((arr[0][1] == 'X' && arr[0][2] == 'X' && arr[0][3] == 'X') ||
                            (arr[1][1] == 'X' && arr[1][2] == 'X' && arr[1][3] == 'X') ||
                            (arr[2][1] == 'X' && arr[2][2] == 'X' && arr[2][3] == 'X') ||
                            (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') ||
                            (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') ||
                            (arr[0][3] == 'X' && arr[1][3] == 'X' && arr[2][3] == 'X') ||
                            (arr[0][1] == 'X' && arr[1][2] == 'X' && arr[2][3] == 'X') ||
                            (arr[2][1] == 'X' && arr[1][2] == 'X' && arr[0][3] == 'X')) {
                        System.out.println();
                        System.out.print("########## CONGRATULATIONS ");
                        System.out.print(abc);
                        System.out.println(" ##########");
                        player1++;
                        System.out.println();

                        System.out.println("           ----------------");
                        System.out.println("              SCOREBOARD");
                        System.out.println("           ----------------");
                        int e = r + 1;
                        System.out.print("             ");
                        System.out.print(abc);
                        System.out.print(" : " + player1);
                        System.out.print("/" + e);
                        System.out.println();
                        System.out.println();
                        System.out.print("             ");
                        System.out.print(xyz);
                        System.out.print(" : " + player2);
                        System.out.print("/" + e);
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        break;
                    }

                    if ((arr[0][1] == '0' && arr[0][2] == '0' && arr[0][3] == '0') ||
                            (arr[1][1] == '0' && arr[1][2] == '0' && arr[1][3] == '0') ||
                            (arr[2][1] == '0' && arr[2][2] == '0' && arr[2][3] == '0') ||
                            (arr[0][1] == '0' && arr[1][1] == '0' && arr[2][1] == '0') ||
                            (arr[0][2] == '0' && arr[1][2] == '0' && arr[2][2] == '0') ||
                            (arr[0][3] == '0' && arr[1][3] == '0' && arr[2][3] == '0') ||
                            (arr[0][1] == '0' && arr[1][2] == '0' && arr[2][3] == '0') ||
                            (arr[2][1] == '0' && arr[1][2] == '0' && arr[0][3] == '0')) {
                        System.out.println();
                        System.out.print("########## CONGRATULATIONS ");
                        System.out.print(xyz);
                        System.out.println(" ##########");
                        player2++;
                        System.out.println();

                        System.out.println("           ----------------");
                        System.out.println("              SCOREBOARD");
                        System.out.println("           ----------------");
                        int o = r + 1;
                        System.out.print("             ");
                        System.out.print(abc);
                        System.out.print(" : " + player1);
                        System.out.print("/" + o);
                        System.out.println();
                        System.out.println();
                        System.out.print("             ");
                        System.out.print(xyz);
                        System.out.print(" : " + player2);
                        System.out.print("/" + o);
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        break;
                    }

                    if (k == 8) {
                        System.out.println();
                        System.out.println("########## CONGRATULATIONS IT WAS A TIE ##########");
                        System.out.println();
                        System.out.println();

                        System.out.println("           ----------------");
                        System.out.println("              SCOREBOARD");
                        System.out.println("           ----------------");
                        int g = r + 1;
                        System.out.print("             ");
                        System.out.print(abc);
                        System.out.print(" : " + player1);
                        System.out.print("/" + g);
                        System.out.println();
                        System.out.print("             ");
                        System.out.print(xyz);
                        System.out.print(" : " + player2);
                        System.out.print("/" + g);
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        break;
                    }
                }
            }

            if (player2 < player1) {
                System.out.println();
                System.out.print("Conclusion : Hurrah! ");
                System.out.print(abc);
                System.out.println(" Wins the Game");
            } else if (player2 > player1) {
                System.out.println();
                System.out.print("Conclusion : Hurrah! ");
                System.out.print(xyz);
                System.out.println(" Wins the Game");
            } else {
                System.out.println();
                System.out.println("Conclusion : Game TIED");
            }
        }
    }
}
