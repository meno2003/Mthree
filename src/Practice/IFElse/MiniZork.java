package Practice.IFElse;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, open the mailbox or hit a rad backflip? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You go to the house");
            System.out.println("the lights gone out!");
            System.out.println("go to the power box or get candles?");
            action = userInput.nextLine();
            if (action.equals("get candles")) {
                System.out.println("drat! were out of candles");
                System.out.println("what was that sound?");
                System.out.println("investigate or run away?");
                action = userInput.nextLine();
                if (action.equals("investigate")){
                    System.out.println("you approach the power box with nothing but the moon light aiding your eyes");
                    System.out.println(" Michelle Obama springs out of the bushes and hacks you with a baseball bat");
                    System.out.println("you've just been obama'd");
                }
                else if (action.equals("run away")){
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("go to the power box")) {
                System.out.println("Michelle Obama springs out of the bushes and hacks you with a baseball bat");
                System.out.println("you've just been obama'd");
            }


        } else if (action.equals("hit a rad backflip")) {
            System.out.println("You probably look super cool right now, any onlookers that might have had malicious ideas against you will back off ");
        }
    }
}