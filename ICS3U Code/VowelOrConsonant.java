import java.util.Scanner;

public class VowelOrConsonant {
    public VowelOrConsonant(){}
    Scanner keyboard = new Scanner(System.in);
    String userChar;
    public void display(){
        for (int i=1; i<=5; i++){
            System.out.print("Enter your character: ");
            userChar = keyboard.nextLine();
            userChar = userChar.toUpperCase();
            char user = userChar.charAt(0);
            switch (user){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Vowel"); break;
                case 'Y':
                case 'W':
                    System.out.println("Sometimes a Vowel"); break;
                default:
                    System.out.println("Consonant");
            }
        }
    }
    public static void main(String[] args){
        VowelOrConsonant v = new VowelOrConsonant();
        v.display();
    }
}
