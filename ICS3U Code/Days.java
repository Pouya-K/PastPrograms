import java.util.Scanner;

public class Days {
    Scanner keyboard = new Scanner(System.in);
    String userInt;
    public Days(){}
    public void input(){
        System.out.print("Enter your days number: ");
        userInt = keyboard.nextLine();
    }
    public void display(){
        for(int i = 0; i<userInt.length(); i++){
            switch (userInt.charAt(i)){
                case '1':
                    System.out.println("Monday"); break;
                case '2':
                    System.out.println("Tuesday"); break;
                case '3':
                    System.out.println("Wednesday"); break;
                case '4':
                    System.out.println("Thursday"); break;
                case '5':
                    System.out.println("Friday"); break;
                case '6':
                    System.out.println("Saturday"); break;
                case '7':
                    System.out.println("Sunday"); break;
                default:
                    System.out.println("Number out of range.");
            }
        }
    }
    public static void main(String[] args){
        Days d = new Days();
        d.input();
        d.display();
    }
}
