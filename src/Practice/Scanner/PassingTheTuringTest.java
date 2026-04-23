package Practice.Scanner;
import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args){

        Scanner IR = new Scanner(System.in);
        String name;
        String color;
        String food;
        double num;


        System.out.println("whats your name?");
        name = IR.nextLine();

        System.out.println("hey " + name + ". My names alex, nice to meet you");


        System.out.println("and your favourite colour?");
        color = IR.nextLine();

        System.out.println(" noway! " + color + " is my favourite color too!");
        // what a kiss ass lol no identity

        System.out.println(", and your fav number and food?");
        num = Double.parseDouble(IR.nextLine());
        food = IR.nextLine();


        //figure out what to do if user includes "and" in his response to fav food and number

        System.out.println(" noway!" + num + "and" + food + "is also my favourite" ); // bro straight lyin now
        System.out.println(" nice to meet you" + name + ". Speak to you soon!");





        System.out.println("hey" + name + "my names alex, nice to meet you");
    }

}
