/*
Name: Pouya Karimi
Date: October 24th, 2022
Teacher: Mr. Gugoiu
Description: This program will display how many minutes have passed since midnight of tonight.
IDE: Intellij IDEA CE
 */
import java.util.Calendar;
import java.util.Scanner;

public class Minutes {
    //Variable declaration
    static Calendar c = Calendar.getInstance();
    static int hour = c.get(Calendar.HOUR_OF_DAY), minute = c.get(Calendar.MINUTE), second = c.get(Calendar.SECOND);
    public static double calculate(){
        double mins = hour*60 + minute + second/60.0;
        return mins;
    }
    public static void main(String[] args){
        System.out.print("From midnight ");
        System.out.print(calculate());
        System.out.print(" minutes have passed.");
    }
}