package Practice.Random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {

        Random randomizer = new Random();
        Scanner Input = new Scanner(System.in);



        System.out.println(randomizer.nextInt());
        int numToBeGuessed = randomizer.nextInt(101);

        System.out.println("Ive chosen a number between 0 and 100, bet you cant guess it: " );
        int guessedNum = Integer.parseInt(Input.next());

        while(guessedNum != numToBeGuessed){
            System.out.println();
            System.out.println(numToBeGuessed);
            numToBeGuessed = randomizer.nextInt(101);

            System.out.println("Wrong, try again: " );
            guessedNum = Input.nextInt();



        }
        if (guessedNum == numToBeGuessed){
            System.out.println("bingo!");
        }

    }


    }