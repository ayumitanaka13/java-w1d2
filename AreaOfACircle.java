import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        // setting a constant value for pi
        final double pi = 3.14159;

        // setting a constant value for pi
        Scanner input = new Scanner(System.in);

        // asking for input
        System.out.println("Please Enter a Radius: ");

        // take in that input
        double radius = input.nextDouble();

        // calculate and print the result
        System.out.println(radius * radius * pi);
    }

}