/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

public class ConnectFour {

    public static String[][] user = new String[10][3];
    public static int[][] score = new int[10][2];
    public static String player1, player2;
    public static int num = 0;
    
    public static void main(String[] args) {
      for(int x = 0; x < 10; x++){
          for(int y = 0; y < 3; y++){
          user[x][y] = " ";
      }
      }
      for(int x = 0; x < 10; x++){
          for(int y=0; y<2; y++){
            score[x][y] = 0;
          }
      }
      new StartScreen().setVisible(true);
    }
    
}
