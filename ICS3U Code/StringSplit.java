import java.util.Scanner;

public class StringSplit {
    static String userString;
    static Scanner keyboard = new Scanner(System.in);
    public static void input(){
        System.out.print("Enter your string which you would like split: ");
        userString = keyboard.nextLine();
    }
    public static void split(String splitter){
        for(int i = 0; i<splitter.length(); i++){
            if(splitter.charAt(i)==' '){
                System.out.println();
            }
            else{
                System.out.print(splitter.charAt(i));
            }
        }
    }
    public static void main(String[] args){
        input();
        split(userString);
    }
}
