import java.util.Scanner;

public class Simplify {
    static int numerator, denominator;
    static Scanner keyboard = new Scanner(System.in);
    public static void input(){
        System.out.print("Enter your numerator: ");
        numerator = keyboard.nextInt();
        System.out.print("Enter your denominator: ");
        denominator = keyboard.nextInt();
    }
    public static void simplify(int firstNum, int secondNum){
        int lowerNum, upperNum, largestFactor=1;
        int positiveNum = Math.abs(firstNum), positiveDen = Math.abs(secondNum);
        if(Math.abs(firstNum)>Math.abs(secondNum)){
            upperNum = Math.abs(firstNum);
            lowerNum = Math.abs(secondNum);
        }
        else {
            upperNum = Math.abs(secondNum);
            lowerNum = Math.abs(firstNum);
        }
        for(int i = 1; i<=lowerNum; i++){
            if(upperNum%i == 0 && lowerNum%i == 0){
                largestFactor = i;
            }
        }
        System.out.print(firstNum+"/"+secondNum+" = ");
        if(firstNum<0 && secondNum>0){
            System.out.print("-");
        }
        else if(firstNum>0 && secondNum<0){
            System.out.print("-");
        }
        System.out.print(positiveNum / largestFactor + "/" + positiveDen / largestFactor);
    }
    public static void main(String[] args){
        input();
        simplify(numerator, denominator);
    }
}
