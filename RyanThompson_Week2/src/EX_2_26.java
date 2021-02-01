import java.util.*;
//Ryan Thompson
//Exercise 2.26
//Program reads two integers to determine whether one is a multiple of the second and prints the results out to the console
public class EX_2_26 {
    public static void main(String[] args) { //Main method
        //Scanner input for keyboard
        Scanner in = new Scanner(System.in);
        //Initial user prompt and variables to hold the input integers
        System.out.println("Enter two integers to check if they're multiples: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        //Multiplies by 3 and 2 to ensure that the numbers provided are one even and one odd
        num1 = num1*3;
        num2 = num2*2;
        //Uses the remainder function to once again determine if there is a remainder zero after dividing the numbers by one another
        if (num1 % num2 == 0) //Remainder 0 = multiples
            System.out.println("The numbers are multiples");
        if (num1 % num2 != 0) //Remainder 0 = !multiples
            System.out.println("The numbers are not multiples");
    }
}
