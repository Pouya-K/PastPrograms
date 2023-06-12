/*
Name: Pouya Karimi
Date: October 17th, 2022
Teacher: Mr. Gugoiu
Description: This program will display an amortization table to display how long it will take to pay
             back a specific principal, with a specific monthly interest rate, and a specific monthly payment, all
             inputted from the keyboard.
*/
import java.util.Scanner;
public class AmortizationTable {
    //Variable Initialization
    static Scanner keyboard = new Scanner(System.in);
    static double principal, interestRate, monthlyPayment;

    public static void input(){ //Input method
        System.out.print("Enter your starting principal: ");
        principal = keyboard.nextDouble();
        System.out.print("Enter your monthly interest rate: ");
        interestRate = keyboard.nextDouble();
        System.out.print("Enter your monthly payment: ");
        monthlyPayment = keyboard.nextDouble();
    } //Input

    public static double round(double num){ //Method which will round a number to 2 decimal places
        num *= 100;
        num = Math.round(num);
        num /= 100;
        return num;
    } //Round
    public static void display(){ //Method which will display the table
        int spacesAfter;
        String stringOf;
        int month = 0;
        //Drawing the title of the table
        System.out.println("Month\t\tPrincipal\t\tInterest Paid\tNew Principal");
        do {
            //Printing the month
            System.out.print(month);
            //Calculating how many spaces should be printed after printing for proper spacing of the table
            stringOf = String.valueOf(month);
            spacesAfter = 12 - stringOf.length();
            for(int i = 1; i<=spacesAfter; i++) System.out.print(" ");
            month++;

            //Printing the initial principal
            System.out.print("$"+principal);
            //Calculating how many spaces should be printed after printing for proper spacing of the table
            stringOf = String.valueOf(principal);
            spacesAfter = 15 - stringOf.length();
            for(int i = 1; i<=spacesAfter; i++) System.out.print(" ");

            //Calculating how much interest is paid each month
            double interestPaid = principal*interestRate;
            interestPaid = round(interestPaid);
            System.out.print("$"+interestPaid);

            //Calculating how many spaces should be printed after printing for proper spacing of the table
            stringOf = String.valueOf(interestPaid);
            spacesAfter = 15 - stringOf.length();
            for(int i = 1; i<=spacesAfter; i++) System.out.print(" ");

            //Calculating and printing the new principal
            principal = principal + interestPaid - monthlyPayment;
            principal = round(principal);
            if(principal<=0){
                System.out.println("$0\n");
            }
            else {
                System.out.println("$" + principal);
            }
        } //Do
        while (principal>0); //Condition for while loop to run
        System.out.print("You have paid off your principal after "+(month-1)+" months!"); //Final end message
    }
    public static void main(String[] args){ //Main method
        input();
        display();
    } //Main
} //Class
