import java.util.Scanner;

public class StringSplit {
    static String userString;
    static Scanner keyboard = new Scanner(System.in);
    public static void input(){
        System.out.print("Enter your string which you would like split: ");
        userString = keyboard.nextLine();
    }
    public static void split(String splitter){
        /*
        Explanation: In short, this program will go through every character in a string.
                     If it finds a space, it will enter a new line.
         */
        for(int i = 0; i<splitter.length(); i++){ //Looping through every character of a string
            if(splitter.charAt(i)==' '){ //Checking if the character is a space
                System.out.println();
            }
            else{
                System.out.print(splitter.charAt(i)); //Printing each character as long as it is not a space
            }
        }
    }
    public static void main(String[] args){
        input();
        split(userString);
    }
}