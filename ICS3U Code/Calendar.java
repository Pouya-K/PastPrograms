/*
Name: Pouya Karimi
Date: October 17th, 2022
Teacher: Mr. Gugoiu
Description: This program will display a calendar based on input from the keyboard. The number of
             days and the starting day will be inputted.
 */
import java.util.Scanner;
public class Calendar {
    //Variable Initialization
    static int spacesBefore, days, counter=1, charsPrinted=0;
    static Scanner keyboard = new Scanner(System.in);
    public static void input(){ //Input method
        System.out.print("Enter your starting day: ");
        spacesBefore = keyboard.nextInt();
        System.out.print("Enter the number of days in your month: ");
        days = keyboard.nextInt();
    } //Input
    public static void display(){ //Display Method
        System.out.println("\nSu Mo Tu We Th Fr Sa"); //Drawing the title of the calendar
        do{
            String printing ="";
            for(int i =1; i<=(spacesBefore-1)*3; i++){ //Initial spacing if the starting day is not 1
                printing += " ";
            }
            if(spacesBefore!=0){ //Only printing the space before the first time the code runs
                System.out.print(printing);
                charsPrinted += printing.length();
            }
            if(counter<10) { //Doing proper spacing for single digit days
                printing = counter + "  ";
                System.out.print(printing);
                charsPrinted+=printing.length();
            }
            else {//Doing proper spacing for double digit days
                printing = counter + " ";
                System.out.print(printing);
                charsPrinted+=printing.length();
            }
            if(charsPrinted>19){ //Entering a new line after a week is done
                System.out.println();
                charsPrinted = 0;
            }
            counter++; //Variable which counts the days
            spacesBefore = -1;
        } //Do
        while (counter<=days); //Condition for while loop to run
    }
    public static void main(String[] args){ //Main Method
        input();
        display();
    } //Main
} //Class