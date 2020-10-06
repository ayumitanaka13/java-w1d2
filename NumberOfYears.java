// (Find the number of years)
// Write a program that prompts the user to enter the minutes (e.g., 1 billion),
// and displays the number of years and days for the minutes. For simplicity,
// assume a year has 365 days

import java.util.Scanner;

public class  NumberOfYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min;
     
        System.out.println("Please enter the minutes: ");
    
        min = input.nextInt();
    
        // 1 year = 525600 min
        int years = min / 525600;
        int remainder = min % 525600;
        int days = remainder / 1440;

        System.out.println(years + " years and " + days + " days");
    }

}
