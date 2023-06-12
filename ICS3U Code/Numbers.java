/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will read a string including both letters and numbers. Then, the program will find where the numbers in the string are and print only the numbers.
*/
import java.util.Scanner;
public class Numbers {
    //Variable Initialization
    String userString;
    Scanner keyboard = new Scanner(System.in);
    boolean printing = false; //Boolean which checks if the string is currently printing a number
    public void input(){ //Input Method
        System.out.print("Enter your string: ");
        userString = keyboard.nextLine();
    } //Input
    public void display(){ //Display method
        for(int i = 0; i<userString.length();i++){
            if(userString.charAt(i)>=48 && userString.charAt(i)<=57){ //Checking if the user has entered a number
                System.out.print(userString.charAt(i));
                printing = true;
            }
            else if (userString.charAt(i)==46){ //Checking if the user has entered a decimal point
                System.out.print(userString.charAt(i));
                printing = true;
            }
            else if (printing){ //This if statement runs when the print has been a number, but is now a letter, which means the number is over
                System.out.println("");
                printing = false;
            }
        } //For loop
    } //Display
    public static void main(String[] args){ //Main method
        Numbers n = new Numbers();
        n.input();
        n.display();
    } //Main method
} //Class
