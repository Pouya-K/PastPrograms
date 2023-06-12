/*
Name: Pouya Karimi
Date: October 17th, 2022
Teacher: Mr. Gugoiu
Description: This program will accept an input in decimal and convert and display said number in binary.
*/
import java.util.Scanner;
public class Binary {
    //Variable Initialization
    Scanner keyboard = new Scanner(System.in);
    String finalBinary="", binary ="";
    int base10, finalBase10;

    public Binary(){} //Constructorpublic class Base64Converter {
    public static int convertToBinary(int base10){ //Display method
        int finalBase10 = base10;
        String finalBinary="", binary ="";
        while(base10/2.0>0){ //While loop which converts the number into binary (takes the remainder when divided by 2)
            int remainder = base10%2;
            binary += ""+remainder;
            base10/=2;
        } //While
        for (int i = binary.length()-1; i>=0; i--){ //For loop which changes the order of the remainders to turn it into the correct binary number
            finalBinary += binary.charAt(i);
        } //For
        return Integer.parseInt(finalBinary);
    } //Display
    public static void main(String[] args){ //Main method
        convertToBinary(1)
    } //Main
} //Class
