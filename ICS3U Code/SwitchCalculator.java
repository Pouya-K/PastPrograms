/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will take an input of 2 numbers and an operator from the user and calculate and display the answer.
*/
import java.util.Scanner;
public class SwitchCalculator {
    public SwitchCalculator(){} //Constructor

    //Variable Initialization
    Scanner keyboard = new Scanner(System.in);
    double firstOperand, secondOperand;
    String operator;
    char charOperator;

    public void input(){ //Input Method
        System.out.print("Enter your first operand:");
        firstOperand = keyboard.nextDouble();
        System.out.print("Enter your second operand:");
        secondOperand = keyboard.nextDouble();
        System.out.print("Enter your operator:");
        operator = keyboard.next();
        charOperator = operator.charAt(0);
    } //Input

    public void display(){ //Display method
        switch (charOperator){ //Checking which operator is selected by the user
            case '+':
                System.out.println(firstOperand +" + "+secondOperand+" = "+ (firstOperand+secondOperand)); break;
            case '-':
                System.out.println(firstOperand +" - "+secondOperand+" = "+ (firstOperand-secondOperand)); break;
            case '*':
                System.out.println(firstOperand +" * "+secondOperand+" = "+ (firstOperand*secondOperand)); break;
            case '/':
                System.out.println(firstOperand +" / "+secondOperand+" = "+ (firstOperand/secondOperand)); break;
            case '%':
                System.out.println(firstOperand +" % "+secondOperand+" = "+ (firstOperand%secondOperand)); break;
            case '^':
                System.out.println(firstOperand +" ^ "+secondOperand+" = "+ (Math.pow(firstOperand,secondOperand))); break;
            default:
                System.out.println("Operator is unrecognized.");
        } //Switch Case
    } //Display
    public static void main(String[] args){ //Main Method
        SwitchCalculator s =  new SwitchCalculator();
        s.input();
        s.display();
    } //Main Method
} //Class
