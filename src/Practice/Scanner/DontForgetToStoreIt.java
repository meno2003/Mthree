package Practice.Scanner;


import java.util.Scanner;

public class DontForgetToStoreIt {

    public static void main(String[] args) {

        String meaningOfLifeAndEverything = "idk";
        double pi = 3.14159;
        String cheese = "feta";
        String color = "Mozzarella";

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        Double.parseDouble(inputReader.nextLine());

        // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt

        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLifeAndEverything = inputReader.nextLine();

        System.out.println("What is your favorite kind of cheese? ");
          color =inputReader.next();
          cheese = inputReader.next();





        System.out.println("Do you like the color red or blue more? ");
        inputReader.nextLine();

        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
        System.out.println("The circumference of life is " + meaningOfLifeAndEverything);
    }
}