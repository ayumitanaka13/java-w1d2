import java.util.Scanner;

public class ComputeAvarage {
    
    public static void main(String[] args) {

        // initialize a scanner object
        Scanner input = new Scanner(System.in);

        // declaring three variables to hold our numbers
        double num1, num2, num3;

        // asking for input
        System.out.println("Please enter 3 numbers: ");

        // initializing our three number variables with values
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        double avg = ((num1 + num2 + num3) / 3);

        System.out.println(avg);
    }

}


