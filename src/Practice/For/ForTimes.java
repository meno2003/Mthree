package Practice.For;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int num;

        System.out.println("Which times table shall I recite?");
        num = Integer.parseInt(Input.next());
        for (int i = 0; i <= 15; i++){
            System.out.println(i + "*" + num + "=" + (i * num) );

        }
    }
}
