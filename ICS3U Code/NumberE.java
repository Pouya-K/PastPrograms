/*
Name: Pouya Karimi
Date: October 17th, 2022
Teacher: Mr. Gugoiu
Description: This program will continuously calculate the number e, getting more precise each time
             and stopping when the difference between two consecutive variations is less than 10^-10.
*/
public class NumberE {
    public NumberE(){}
    //Variable Initialization
    double previousAdding=0, currentAdding=0, e, n;
    public void calculate(){ //Method which will calculate and print e
        for(n=1;;n++){ //For loop which will calculate e each time
            previousAdding = currentAdding; //Calculating the previous e 
            currentAdding = Math.pow(1+1/n, n); //Calculating the new e
            if(currentAdding - previousAdding>0.0000000001) { //Staying in the loop and printing e if the difference is less than 10^-10
                e = currentAdding;
            } //If
            else{
                break;
            } //Else
        } //For
        //Output
        System.out.println("N = "+(n-1));
        System.out.println("E = "+e);
    } //Calculate
    public static void main(String[] args){ //Main Method
        NumberE num = new NumberE();
        num.calculate();
    } //Main
} //Class
