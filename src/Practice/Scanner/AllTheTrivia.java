package Practice.Scanner;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        String triviaQ1;
        String triviaQ2;
        String triviaQ3;
        double triviaQ4;

        //I have variable names random and vague as to keep randomization fair


        //Q1 Trivia
        System.out.println("how many people are on planet earth?");
        triviaQ4 = Double.parseDouble(inputReader.nextLine());
        System.out.println(triviaQ4);


        //Q2 Trivia
        System.out.println("what do you call a well balanced horse?");
        triviaQ2 = inputReader.nextLine();
        System.out.println(triviaQ2);

        //Q3 Trivia
        System.out.println("whats the largest country in africa?");
        triviaQ1 = inputReader.nextLine();
        System.out.println(triviaQ1);


        //Q4 Trivia
        System.out.println("whats the capital of India?");
        triviaQ3 = inputReader.nextLine();
        System.out.println(triviaQ3);
        triviaQ3 = triviaQ3.toUpperCase();



        if (triviaQ3.equals("NEW DELHI")){
            System.out.println("bang on! it is "+ triviaQ2);

        }
        else{
            System.out.println("no lol");
        }




        if (triviaQ2.equals("a stable")){
            System.out.println(" a stable? pfft, musta heard that one before huh");
        }
        else
            System.out.println( " a stable"); // comedy genius here


        if (triviaQ1.equals("ALGERIA"))
        System.out.println("correct! it is" + triviaQ1);

        System.out.println("good lawd is there really "+ triviaQ4 + " on  earth?!");
    }
}
