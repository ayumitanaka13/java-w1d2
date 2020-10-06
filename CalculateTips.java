// (Financial application: calculate tips)
// Write a program that reads the subtotal and the gratuity rate,
// then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate,
// the program displays $1.5 as gratuity and $11.5 as total. 

import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill;

        System.out.println("Please enter your bill: ");

        bill = input.nextDouble();

        double total = (1.15 * bill);

        System.out.println(total);
    }
    
}
