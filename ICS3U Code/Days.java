/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will take an input of numbers from the user corresponding to the days of the week. It will print each day of the week on a new line.
*/
import java.util.Scanner;
public class Days {
    Scanner keyboard = new Scanner(System.in);
    String userInt;
    public Days(){}
    public void input(){ //Input Method
        System.out.print("Enter your days number: ");
        userInt = keyboard.nextLine();
    } //Input
    public void display(){ //Display Method
        for(int i = 0; i<userInt.length(); i++){
            switch (userInt.charAt(i)){
                case '1':
                    System.out.println("Monday"); break;
                case '2':
                    System.out.println("Tuesday"); break;
                case '3':
                    System.out.println("Wednesday"); break;
                case '4':
                    System.out.println("Thursday"); break;
                case '5':
                    System.out.println("Friday"); break;
                case '6':
                    System.out.println("Saturday"); break;
                case '7':
                    System.out.println("Sunday"); break;
                default:
                    System.out.println("Number out of range.");
            } //Switch Case
        } //For loop
    } //Display method
    public static void main(String[] args){ //Main Method
        Days d = new Days();
        d.input();
        d.display();
    } //Main Method
} //Class
