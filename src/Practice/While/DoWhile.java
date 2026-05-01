package Practice.While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int num;
        do {
            System.out.println("select a number between 1 and 10");
            num = Integer.parseInt(Input.next());
        }while(num < 1 || num >10);

        System.out.println(num + " is between 1 and 10");
    }
}
