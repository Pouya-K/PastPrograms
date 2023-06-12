/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will accept an input from the character. The inputted string represents a tic-tac-toe game. The program will decide which player has won the tic-tac-toe game.
*/
import java.util.Scanner;
public class TicTacToe {
    //Variable Initialization
    String gameNum;
    String firstPlayer ="", secondPlayer ="";
    String subOfFirst, subOfSecond;
    Scanner keyboard = new Scanner(System.in);
    Boolean oneWin = false, twoWin = false;
    public TicTacToe(){} //Constructor
    public void getInput(){ //Method which accepts the input from the keyboard
        System.out.println("Enter the number equivalent of your game.");
        gameNum = keyboard.nextLine();
    } //Input
    public boolean win(String subString){ //Boolean method which checks if a player has won the game
        if(subString.contains("1") && subString.contains("2") && subString.contains("3")){
            return true;
        }
        else if(subString.contains("4") && subString.contains("5") && subString.contains("6")){
            return true;
        }
        else if(subString.contains("7") && subString.contains("8") && subString.contains("9")){
            return true;
        }
        else if(subString.contains("1") && subString.contains("4") && subString.contains("7")){
            return true;
        }
        else if(subString.contains("2") && subString.contains("5") && subString.contains("8")){
            return true;
        }
        else if(subString.contains("3") && subString.contains("6") && subString.contains("9")){
            return true;
        }
        else if(subString.contains("1") && subString.contains("5") && subString.contains("9")){
            return true;
        }
        else if(subString.contains("3") && subString.contains("5") && subString.contains("7")){
            return true;
        }
        else {
            return false;
        }
    } //Boolean Method
    public void output(){ //Output method
        for(int i = 0; i<gameNum.length(); i+=2){ //Converting the entire string into a smaller string of only the first player's moves
            String addingString = String.valueOf(gameNum.charAt(i));
            firstPlayer += addingString;
        }
        for(int i = 1; i<gameNum.length(); i+=2){ //Converting the entire string into a smaller string of only the second player's moves
            String addingString = String.valueOf(gameNum.charAt(i));
            secondPlayer += addingString;
        }
        for(int i = 3; i<5; i++){ //Checking moves one by one to see which team wins first
            subOfFirst = firstPlayer.substring(0,i);
            subOfSecond = secondPlayer.substring(0,i);
            if(win(subOfFirst)){ //Checking if the first player has won
                System.out.print("Player 1 Wins!");
                oneWin = true;
                break;
            } //If statement
            if(win(subOfSecond)){ //Checking if the second player has won
                System.out.print("Player 2 Wins!");
                twoWin = true;
                break;
            } //If statement
        } //For Loop
        if(!oneWin && !twoWin){ //Draw
            System.out.print("Draw!");
        } //If statement
    } //Output
    public static void main(String[] args){ //Main Method
        TicTacToe t = new TicTacToe();
        t.getInput();
        t.output();
    } //Main Method
} //Class