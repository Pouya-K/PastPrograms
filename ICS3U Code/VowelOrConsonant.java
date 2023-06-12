/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This code will accept an input from the user 5 times, and display whether the inputted character is a vowel, sometimes a vowel, or a consonant.
*/
import java.util.Scanner;
public class VowelOrConsonant {
    public VowelOrConsonant(){} //Constructor
    //Variable Initialization
    Scanner keyboard = new Scanner(System.in);
    String userChar;

    public void display(){ //Display Method
        for (int i=1; i<=5; i++){
            //Getting the input from the user
            System.out.print("Enter your character: ");
            userChar = keyboard.nextLine();
            userChar = userChar.toUpperCase();
            char user = userChar.charAt(0);

            switch (user){ //Checking to see which category the user's character falls into
                //Cases where the user's char is a vowel
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Vowel"); break;
                //Cases where the user's char is sometimes a vowel
                case 'Y':
                case 'W':
                    System.out.println("Sometimes a Vowel"); break;
                //Default case (User's char is a consonant)
                default:
                    System.out.println("Consonant");
            } //Switch
        } //For loop
    } //Display method
    public static void main(String[] args){ //Main method
        VowelOrConsonant v = new VowelOrConsonant();
        v.display();
    } //Main Method
} //Class
