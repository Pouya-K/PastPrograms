/*
Name: Pouya Karimi
Date: October 24th, 2022
Teacher: Mr. Gugoiu
Description: This program will simplify a number which is inputted by the user.
IDE: Intellij IDEA CE
 */
import java.util.Scanner;

public class Simplify {
    //Variable Declaration
    static int numerator, denominator; //Input variables
    static Scanner keyboard = new Scanner(System.in);

    public static void input(){ //Input method
        System.out.print("Enter your numerator: ");
        numerator = keyboard.nextInt();
        System.out.print("Enter your denominator: ");
        denominator = keyboard.nextInt();
    } //input
    public static void simplify(int firstNum, int secondNum){ //Method which will simplify a number
        /*
        Explanation: The goal is to check what the largest factor is that divides evenly into both
                     the numerator and the denominator. To check, we start from 1, and go up to the
                     smaller number between the numerator and the denominator. In case one of them is
                     negative, we take the absolute value of both. We then find which one is bigger and
                     which one is smaller. The loop then runs until our counter is equal to the smaller number.
                     Everytime a number is a factor of both numbers, it is stored in a variable. At the end of
                     the loop, both numbers are divided by the largest factor, which is displayed as the simplified form.
         */
        //Variable Declaration
        int numerator, denominator; //Input variables
        int lowerNum, upperNum, largestFactor=1;
        int positiveNum = Math.abs(firstNum), positiveDen = Math.abs(secondNum); //Variable which hold the absolute value of numbers
        //Checking which number is larger
        if(Math.abs(firstNum)>Math.abs(secondNum)){
            upperNum = Math.abs(firstNum);
            lowerNum = Math.abs(secondNum);
        }
        else {
            upperNum = Math.abs(secondNum);
            lowerNum = Math.abs(firstNum);
        }
        //Looping through every number to see which is the largest number
        for(int i = 1; i<=lowerNum; i++){
            if(upperNum%i == 0 && lowerNum%i == 0){
                largestFactor = i;
            }
        }
        //Display
        System.out.print(firstNum+"/"+secondNum+" = ");
        //Checking if the fraction should be negative
        if(firstNum<0 && secondNum>0){
            System.out.print("-");
        }
        else if(firstNum>0 && secondNum<0){
            System.out.print("-");
        }
        System.out.print(positiveNum / largestFactor + "/" + positiveDen / largestFactor);
    } //simplify
    public static void main(String[] args){ //Main method
        input();
        simplify(numerator, denominator);
    } //main
} //class