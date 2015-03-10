/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

public class ConnectFour {
  
    public static String[] players = new String[10];
    public static String[] passwords = new String[10];
    public static String[] names = new String[10];
    public static int[] score = new int[10];
    public static String player1;
    public static String player2;
    public static int num = 0;
    
    public static void main(String[] args) {
      for(int x = 0; x < 10; x++){
          players[x] = " ";
      }
      for(int x = 0; x < 10; x++){
          passwords[x] = " ";
      }
      for(int x = 0; x < 10; x++){
          names[x] = " ";
      }
      for(int x = 0; x < 10; x++){
          score[x] = 0;
      }
      new StartScreen().setVisible(true);
    }
    
}
