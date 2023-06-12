/*
Name: Pouya Karimi
Date: Ocotber 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will display taxes which need to be paid based on an income inputted from the keyboard by the user.
*/
import java.util.Scanner;

public class Taxes {
    //Variable Initialization
    Scanner keyboard = new Scanner(System.in);
    double income, tax, calculatingIncome;
    public Taxes(){} //Constructor
    public void input(){ //Input Method
        System.out.println("Enter your yearly income:");
        income = keyboard.nextInt();
    } //Input Method
    public void output(){ //Output Method
        if(income<=20000){ //Calculating tax if income is less than $20,000
            System.out.println("Your income is "+income+" which means you pay no taxes.");
        }
        else if(income>20000 && income < 40000){ //Calculating tax if income is between $20,000 and $40,000
            calculatingIncome = income;
            income -= 20000;
            tax += income * 0.2;
            System.out.println("Your income is "+calculatingIncome+" dollars which means you pay $"+tax+" in taxes.");
        }
        else if(income>=40000){ //Calculating tax if income is more than $40,000
            calculatingIncome = income;
            income -= 40000;
            tax = 20000*0.2;
            tax += income * 0.3;
            System.out.println("Your income is "+calculatingIncome+" dollars which means you pay $"+tax+" in taxes.");
        }
    } //Output Method
    public static void main(String[] args){ //Main Method
        Taxes t = new Taxes(); //Creating a new instance of the class
        //Running the display methods
        t.input();
        t.output();
    } //Main Method
} //Class