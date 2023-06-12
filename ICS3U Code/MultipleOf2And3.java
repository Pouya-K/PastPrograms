import java.util.Scanner;

public class MultipleOf2And3 {
    Scanner keyboard = new Scanner(System.in);
    int userNum;
    public MultipleOf2And3(){}
    public void input(){
        System.out.print("Please enter your integer:");
        userNum = keyboard.nextInt();
    }
    public void display(){
        if (userNum % 2 == 0 && userNum % 3 != 0){
            System.out.println("Your number is a multiple of 2 but not 3.");
        }
        else if (userNum % 2 != 0 && userNum % 3 == 0){
            System.out.println("Your number is a multiple of 3 but not 2.");
        }
        else if (userNum % 2 == 0 && userNum % 3 == 0){
            System.out.println("Your number is a multiple of 2, and 3.");
        }
        if (userNum % 2 != 0 && userNum % 3 != 0){
            System.out.println("Your number is not a multiple of 2 nor 3.");
        }
    }
    public static void main(String[] args){
        MultipleOf2And3 m = new MultipleOf2And3();
        m.input();
        m.display();
    }
}
