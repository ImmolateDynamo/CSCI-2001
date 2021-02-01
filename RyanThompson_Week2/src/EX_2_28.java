import java.util.*;
//Ryan Thompson
//Exercise 2.28
//Program takes the provided integer radius from the user and utilizes it to find the diameter, circumference and area of a circle using mathematical equations directly integrated into formatted print statements
public class EX_2_28 {
    public static void main(String[] args) { //Main method
        //Scanner input for keyboard
        Scanner in = new Scanner(System.in);
        //Initial user prompt and variable for the integer
        System.out.println("Enter the radius of a circle");
        int radius = in.nextInt();
        //Formatted print statements include the equations, and utilize Math.PI for a more accurate approximation of the number for the Circumference and Area
        System.out.printf("The diameter is %d%n", radius*2); //Diameter formula and console print
        System.out.printf("The circumference is %.2f%n", 2* Math.PI*radius); //Circumference formula and console print
        System.out.printf("The Area is %.2f", Math.PI*radius*radius); //Area formula and console print
    }
}
