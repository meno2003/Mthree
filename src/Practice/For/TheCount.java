package Practice.For;

import java.util.Scanner;

public class TheCount {

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int numStart;
        int numEnd;
        int numInc;

        System.out.println(" I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU!");
        System.out.println("start at:");
        numStart = Integer.parseInt(Input.next());

        System.out.println("end at:");
        numEnd = Integer.parseInt(Input.next());

        System.out.println("increment by :");
        numInc = Integer.parseInt(Input.next());

        for(int i = numStart; i<=numEnd; i+= numInc){
            System.out.println(i);
        }

    }
}
