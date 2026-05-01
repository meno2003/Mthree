package Practice.Projects;
import java.util.Scanner;

import static java.lang.System.exit;

public class app {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while (true) {
    System.out.println("what operation would you like to perform?");
    System.out.println("1: Addition");
    System.out.println("2: Subtraction");
    System.out.println("3: Multiply");
    System.out.println("4: Division");
    System.out.println("5: exit program");
    System.out.println("enter the respective number you want to perform: ");
    int op = Integer.parseInt(Input.nextLine());


    if (op == 1) {
        System.out.println("enter the first value");
        int op1 = Integer.parseInt(Input.nextLine());

        System.out.println("enter the second value");
        int op2 = Integer.parseInt(Input.nextLine());

        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.Add(op1, op2);
        System.out.println(result);
    } else if (op == 2) {
        System.out.println("enter the first value");
        int op1 = Integer.parseInt(Input.nextLine());

        System.out.println("enter the second value");
        int op2 = Integer.parseInt(Input.nextLine());

        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.Sub(op1, op2);
        System.out.println(result);
    } else if (op == 3) {
        System.out.println("enter the first value");
        int op1 = Integer.parseInt(Input.nextLine());

        System.out.println("enter the second value");
        int op2 = Integer.parseInt(Input.nextLine());

        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.Mult(op1, op2);
        System.out.println(result);
    } else if (op == 4) {
        System.out.println("enter the first value");
        int op1 = Integer.parseInt(Input.nextLine());

        System.out.println("enter the second value");
        int op2 = Integer.parseInt(Input.nextLine());

        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.Div(op1, op2);
        System.out.println(result);
    } else {
        System.exit(0);
    }

}
    }
}
