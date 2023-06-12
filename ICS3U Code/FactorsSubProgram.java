import java.util.Scanner;

public class FactorsSubProgram {
    static Scanner keyboard = new Scanner(System.in);
    static int userNum;
    public static void input(){
        System.out.print("Enter your number: ");
        userNum = keyboard.nextInt();
    }
    public static void factors(int num){
        System.out.print(num+": ");
        for(int i=1; i<num; i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
        char bc = '\b';
        System.out.print(bc);
        System.out.print(bc);
    }
    public static void main(String[] args){
        input();
        factors(userNum);
    }
}
