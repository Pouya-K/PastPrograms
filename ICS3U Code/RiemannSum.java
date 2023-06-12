/*
Name: Pouya Karimi
Date: October 17th, 2022
Teacher: Mr. Gugoiu
Description: This program will calculate the Riemann sum, which is an approximation of the sum of the
             area under a curve between two points on said curve. N, the number of intervals under the
             curve, is inputted from the keyboard.
 */
import java.util.Scanner;
public class RiemannSum {
    public RiemannSum(){} //Constructor
    //Variable Initialization
    Scanner keyboard = new Scanner(System.in);
    double n, w, sum, a=1, b=2;

    public double function (double x){ //Function of x (what y is equal too if graphed)
        //This calculation is put inside a function so it can be changed to calculate Riemann sums for other functions
        return x*x;
    } //Function
    public void display(){ //Display Method
        //Inputting the number of intervals from the keyboard
        System.out.println("Enter your end number (n): ");
        n = keyboard.nextDouble();

        w = (b-a)/n; //Calculating the length of each interval
        for (int i = 0; i<n; i++){ //Calculating the Riemann sum
            sum += w * function(a+i*w);
        }
        System.out.println("The Riemann sum approximation is: " + sum);
    } //Display
    public static void main(String[] args){ //Main Method
        RiemannSum r = new RiemannSum();
        r.display();
    } //Main
} //Class