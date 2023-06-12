/*
Name: Pouya Karimi
Date: Ocotber 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will classify a character entered by the user.
*/
import java.util.Scanner;

public class Characters {
    public Characters(){} //Constructor
    Scanner keyboard = new Scanner(System.in);
    String input;
    char charInput;
    public void getInput(){ //Method which will input the needed character
        System.out.print("Enter your character.");
        input = keyboard.nextLine();
        charInput = input.charAt(0);
    } //getInput
    public void output() { //Method which will check what the character is and display it
        if (charInput >= 97 && charInput <= 122) {
            System.out.print("Your inputted character is a lowercase letter.");
        } else if (charInput >= 65 && charInput <= 90) {
            System.out.print("Your inputted character is an uppercase letter.");
        } else if (charInput >= 48 && charInput <= 57) {
            System.out.print("Your inputted character is a digit.");
        } else if (charInput >= 0 && charInput <= 31) {
            System.out.print("Your inputted character is a control.");
        } else if (charInput == 127) {
            System.out.print("Your inputted character is a control.");
        } else {
            System.out.print("Your inputted character is punctuation.");
        }
    } //Output
    public static void main (String[] args){ //Main Method
        Characters c = new Characters(); //Creating a new instance of the class
        //Running the display methods
        c.getInput();
        c.output();
    } //Main Method
} //Class
