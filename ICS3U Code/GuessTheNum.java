/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will display a guess the number game where the user has 5 attempts to guess a number between 20 and 100.
*/
import java.util.Scanner;

public class GuessTheNum
{
    //Variable initialization
    Boolean guessedTheNum = false; //Boolean to check if the user has correctly guessed the number
    double randNum = 20 + (Math.random()*100); //Number which has to be guessed by user
    Scanner keyboard = new Scanner(System.in);
    public GuessTheNum() //Constructor
    {}
    public void game() //Method which displays the game
    {
        for (int i=1; i<=5 && !guessedTheNum; i++) //For loop which loops 5 mean representing the user's 5 guesses
        {
            System.out.println("Enter your guess:");
            randNum = (int) randNum;
            int guess = keyboard.nextInt();
            //Checking if the user has entered the correct number, a larger number, or a smaller number
            if (guess == randNum)
            {
                guessedTheNum=true;
            } //if
            else if (guess>randNum)
            {
                System.out.println("Your guess is higher than the answer.");
            } //Else if
            else
            {
                System.out.println("Your guess is lower than the answer.");
            } //Else
        } //For loop
        //Win/Lose Messages
        if (guessedTheNum)
        {
            System.out.println("Congrats! You guessed the correct number!");
        } //If
        else {
            System.out.println("Unlucky! The correct number was "+randNum+". Play again to try and guess a new number.");
        } //Else
    } //Game Method
    public static void main(String[] args) //Main Method
    {
        GuessTheNum g = new GuessTheNum(); //Creating a new instance of the class
        //Running the display methods
        g.game();
    } //Main method end
} //Class end
