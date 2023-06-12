/*
Name: Pouya Karimi
Date: October 24th, 2022
Teacher: Mr. Gugoiu
Description: This program will accept an integer from the user via the keyboard.
             It will then display the prime factorization of the number.
IDE: Intellij IDEA CE
 */
import java.util.Scanner;

public class PrimeFactorization {
    //Variable Declaration
    static int userNum;
    static Scanner keyboard = new Scanner(System.in);

    public static void input(){ //Input method
        System.out.println("Enter your integer: ");
        userNum = keyboard.nextInt();
    } //input
    public static boolean isPrime (int num) //Method which will check if a number is prime
    {
        for (int i  = 2; i<= Math.sqrt(num); i++)
        {
            if (num % i == 0 && i!=num)
            {
                return false;
            }
        }
        return true;
    } //isPrime
    public static void factorize(int param){ //Method which will display the prime factorization
        //Local Variables
        String output;
        int checkPrime = 2, counter=0;
        System.out.print(param +" = ");

        /*
        Explanation: The loop will loop through all numbers, starting from 2, the smallest prime number.
                     If the number is both prime and a factor of the user's number, we enter the inner loop.
                     In the inner loop, we check how many times that factor can be divided into the user's
                     number.
         */
        while(param>1){ //Loop which will continue dividing the user's number by prime numbers
            if(isPrime(checkPrime) && param%checkPrime==0){ //Checking if the factor is prime
                counter = 0;
                while (param%checkPrime == 0){ //Checking how many times that prime number can divide into the number
                    counter++;
                    param/=checkPrime;
                }
                System.out.print("("+checkPrime+"^"+counter+")"); //Printing the current prime factor
            }
            checkPrime++; //Increasing the counter which will be checked to see if the factor is prime
        }
    } //Factorize
    public static void main(String[] args){ //Main method
        input();
        factorize(userNum);
    } //main
} //class
