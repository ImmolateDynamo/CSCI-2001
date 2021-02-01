import java.util.*;
//Ryan Thompson
//Exercise 2.15
//Program prompts the user for two integers, and then provides the sum, difference, product and quotient using the techniques provided in the book
public class EX_2_15 {
    public static void main(String[] args) { //Main method
        //Scanner import for the keyboard
        Scanner in = new Scanner(System.in);
        //Prompts for the user to enter their integers and variables to hold them
        System.out.print("Enter first integer: ");
        int number1 = in.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = in.nextInt();

        //The equations for the mathematical operations
        int sum = number1 + number2;
        int sub = number1 - number2;
        int multi = number1 * number2;
        int div = number1 / number2;

        //Print statements formatted for the answers
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Difference is %d%n", sub);
        System.out.printf("Product is %d%n", multi);
        System.out.printf("Quotient is %d%n", div);
    }
}
