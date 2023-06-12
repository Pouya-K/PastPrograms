/*
Name: Pouya Karimi
Date: October 12th, 2022
Teacher: Mr. Gugoiu
Description: This program will input a password from the keyboard and determine if it is a strong password based on certain requirements.
*/
import java.util.Scanner;
public class Password {
    public Password(){} //Constructor
    //Variable Initialization
    Scanner keyboard = new Scanner(System.in);
    String password;

    //Method which checks if the password has at least 12 characters
    public boolean has12Chars (String password){
        if(password.length()>=12){
            return true;
        }
        else{
            return false;
        }
    }

    //Method which checks if the password has at least one upper case character
    public boolean hasUpper (String password){
        boolean hasUpperChar = false;
        for (int i =0; i<password.length(); i++){
            if(password.charAt(i)>=65 && password.charAt(i)<=90){
                hasUpperChar = true;
            }
        }
        if(hasUpperChar){
            return true;
        }
        else{
            return false;
        }
    }

    //Method which checks if the password has at least one lower case character
    public boolean hasLower (String password){
        boolean hasLowerChar = false;
        for (int i =0; i<password.length(); i++){
            if(password.charAt(i)>=97 && password.charAt(i)<=122){
                hasLowerChar = true;
            }
        }
        if(hasLowerChar){
            return true;
        }
        else{
            return false;
        }
    }

    //Method which checks if the password has at least one digit
    public boolean hasDigit (String password){
        if (password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")||password.contains("0")){
            return true;
        }
        else {
            return false;
        }
    }

    //Method which checks if the password has at least one symbol
    public boolean hasSymbol (String password){
        if (password.contains("~")||password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")||password.contains("?")||password.contains(".")||password.contains("<")||password.contains(">")||password.contains("[")||password.contains("]")||password.contains("{")||password.contains("}")||password.contains("+")||password.contains("-")||password.contains("=")||password.contains("_")){
            return true;
        }
        else {
            return false;
        }
    }

    //Input method which asks for the password
    public void input(){
        System.out.print("Enter your password: ");
        password = keyboard.nextLine();
    }

    //Output method which displays if the password is considered strong or not
    public void output(){
        if(has12Chars(password) && hasUpper(password) && hasLower(password) && hasDigit(password) && hasSymbol(password)){
            System.out.println("Your password is strong! Nice password.");
        }
        else {
            System.out.println("Your password is weak! Make a new one and try again!");
        }
    }

    //Main Method
    public static void main(String[] args){
        Password p = new Password();
        p.input();
        p.output();
    }
}
