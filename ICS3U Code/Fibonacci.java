/*
Name: Pouya Karimi
Date: October 17th, 2022
Teacher: Mr. Gugoiu
Description: This program will print all the numbers in the fibonacci sequence between a lower and
             upper limit which are inputted from the keyboard.
*/
import java.util.Scanner;
public class Fibonacci {
    //Variable Initialization
    static Scanner keyboard = new Scanner(System.in);
    static int previousNum = 0, currentNum=1, lowerLimit, upperLimit;

    public static void input(){ //Input method
        System.out.print("Enter your lower limit: ");
        lowerLimit = keyboard.nextInt();
        System.out.print("Enter your upper limit: ");
        upperLimit = keyboard.nextInt();
    } //Input
    public static void display(){ //Display method
        if(lowerLimit <= 1) {
            //Printing the additional 1 if the lower limit is the start of the fibonacci sequence (The sequence starts with two 1's)
            System.out.println(currentNum);
        } //If
        while(currentNum<=upperLimit){ //While loop which calculates the fibonacci sequence
            int placeHolder = currentNum;
            currentNum = previousNum + currentNum;
            previousNum = placeHolder;
            if(currentNum>=lowerLimit && currentNum<=upperLimit){ //Only printing the fibonacci numbers if they are in the required range
                System.out.println(currentNum);
            } //If
        } //While
    } //Display
    public static void main(String[] args){ //Main Method
        input();
        display();
    } //Main
} //Class
