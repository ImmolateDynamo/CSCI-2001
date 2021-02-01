import java.util.*;
//Ryan Thompson
//Exercise 2.16
//Program prompts the user for two integers and compares them, displaying the larger of the two with "is larger", or if they're the same "These numbers are equal" using techniques from the book
public class EX_2_16 {
    public static void main(String[] args) { //Main method
        //Scanner input for the keyboard
        Scanner in = new Scanner(System.in);
        //Initial user prompt and variables to hold the integers
        System.out.print("Enter first integer: ");
        int number1 = in.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = in.nextInt();
        //Logical comparisons utilizing greater than, less than, and equal to to, as well as the appropriate println statements for the appropriate results which are sent to the console
        if (number1 == number2){
            System.out.println("These numbers are equal");
        }
        if (number1 < number2){
            System.out.printf("%d is larger", number2);
        }
        if (number1 > number2){
            System.out.printf("%d is larger", number1);
        }
    }
}
