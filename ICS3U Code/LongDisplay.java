import java.util.Scanner;

public class LongDisplay {
    static int userNum;
    static
    Scanner keyboard = new Scanner(System.in);
    public static void input(){
        System.out.print("Enter your number: ");
        userNum = keyboard.nextInt();
    }
    public static void display(int num){
        String stringOfNum = String.valueOf(num);
        for(int i = 0; i< stringOfNum.length(); i++){
            int printingNum = Character.getNumericValue(stringOfNum.charAt(i));
            for(int j = 1; j<=printingNum; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        input();
        display(userNum);
    }
}
