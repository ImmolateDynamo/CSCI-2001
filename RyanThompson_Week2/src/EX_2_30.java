import java.util.*;
//Ryan Thompson
//Exercise 2.30
//Program captures a five-digit integer from the user and breaks it down into it's individual
public class EX_2_30 {
    public static void main(String[] args) { //Main method
        //
        Scanner in = new Scanner(System.in);
        //Scanner input for keyboard and variables to capture user input
        System.out.println("Enter a 5-digit integer: ");
        int num, first, second, third, fourth, fifth;
        num = in.nextInt();
        //If statements capture exceptions for integers greater than or less than five digits, and then only process five digit integer inputs
        if (num >= 100000)
            System.out.println("Number is greater than five-digits");
        if (num <= 9999)
            System.out.println("Number is less than five-digits");
        if (num < 100000 && num > 9999) {
            //Utilizes division, subtraction and multiplication and remainder for each place in the integer to source it's number and store it to a variable based on its position from left ot right
            first = num / 10000;
            num = num - first * 10000;

            second = num / 1000;
            num = num - second * 1000;

            third = num / 100;
            num = num - third * 100;

            fourth = num / 10;

            fifth = num % 10;
            //Prints the formatted output to the console based on each number in the sequence
            System.out.printf("%d   %d   %d   %d   %d", first, second, third, fourth, fifth);
        }
    }
}
