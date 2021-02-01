import java.util.*;
//Ryan Thompson
//Exercise 2.25
//Program determines whether the integer is even or odd by utilizing the remainder operator. If the number is even, it prints a different response than if the number is odd
public class EX_2_25 {
    public static void main(String[] args) { //Main method
        //Scanner input for the keyboard
        Scanner in = new Scanner(System.in);
        //Initial user prompt and variable to hold the input
        System.out.println("Enter the number you want determined: ");
        int num = in.nextInt();
        //Simple mathematical test. As any multiple of 2 leaves a remainder of 0 when divided by 2, using if statements and the remainder function, we can determine whether or not the number is even or odd
        if (num % 2 == 0) //Remainder of 0 = Even
            System.out.println("Number is even, it's divisible by 2");
        if (num % 2 != 0) //Remainder of not 0 = Odd
            System.out.println("Number is odd, it's not divisible by 2");
    }
}
