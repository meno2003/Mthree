package Practice.Projects;

import java.util.Scanner;

public class RockPaperScissors {
     public static void main(String[] args){

         Scanner IR = new Scanner(System.in);
         String player1;
         String player2;

         int scorePlayer1 = 0;
         int scorePlayer2 = 0;

         String rock = "ROCK";
         String paper = "PAPER";
         String scissors = "SCISSORS";
         int rounds = 0;


         System.out.println(" How many rounds? the max is 10 before the game ends: ");
         rounds = Integer.parseInt(IR.next());
         if (rounds > 10){
             rounds = 10;
         }

         for(int i = 0; i < rounds; i++){


             System.out.println();
             System.out.println();

             System.out.println("Player 1. rock paper or scissors? Enter your choice: ");
             player1 = IR.next();
             player1 = player1.toUpperCase();

             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();



             System.out.println("Player 2. rock paper or scissors? Enter your choice: ");
             player2 = IR.next();
             player2 = player2.toUpperCase();

             // If Draw
             if (player1.equals(player2)){
                 System.out.println(" draw ");
             }

             // If player1 selects Rock outcome
             if (player1.equals(rock)&&player2.equals(paper)) {
                 System.out.println(" unlucky player1, player 2 wins!");
                 scorePlayer2 ++;

             }
             if (player1.equals(rock)&&player2.equals(scissors)) {
                 System.out.println(" unlucky player2, player 1 wins!");
                 scorePlayer1 ++;

             }

             // If player1 selects Paper outcomes
             if (player1.equals(paper)&&player2.equals(rock)) {
                 System.out.println(" unlucky player2, player 1 wins!");
                 scorePlayer1 ++;

             }
             if (player1.equals(paper)&&player2.equals(scissors)) {
                 System.out.println(" unlucky player2, player 1 wins!");
                 scorePlayer2 ++;

             }

             //If player1 Selects Scissors outcomes
             if (player1.equals(scissors)&&player2.equals(rock)) {
                 System.out.println(" unlucky player1, player 2 wins!");
                 scorePlayer2 ++;

             }
             if (player1.equals(scissors)&&player2.equals(paper)) {
                 System.out.println(" unlucky player2, player 1 wins!");
                 scorePlayer1 ++;

             }
             System.out.println();
             System.out.println(" the score for player 1 is " + scorePlayer1);
             System.out.println(" the score for player 2 is " + scorePlayer2);
         }
         System.out.println();
         System.out.println("that was the final round");
         System.out.println();

         if (scorePlayer1>scorePlayer2){
             System.out.println("Player 1 wins! well played");
         }

         if (scorePlayer2>scorePlayer1){
             System.out.println("Player 2 wins! well played!");
         }

         if (scorePlayer2 == scorePlayer1){
             System.out.println(" Draw, well played");
         }

     }
}
