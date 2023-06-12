import java.util.Scanner;

public class Calendar {
    static int spacesBefore, days, counter=1, charsPrinted=0;
    static Scanner keyboard = new Scanner(System.in);
    public static void input(){
        System.out.print("Enter your starting day: ");
        spacesBefore = keyboard.nextInt();
        System.out.print("Enter the number of days in your month: ");
        days = keyboard.nextInt();
    }
    public static void display(){
        System.out.println("\nSu Mo Tu We Th Fr Sa");
        do{
            String printing ="";
            for(int i =1; i<=(spacesBefore-1)*3; i++){
                printing += " ";
            }
            if(spacesBefore!=0){
                System.out.print(printing);
                charsPrinted += printing.length();
            }
            if(counter<10) {
                printing = counter + "  ";
                System.out.print(printing);
                charsPrinted+=printing.length();
            }
            else {
                printing = counter + " ";
                System.out.print(printing);
                charsPrinted+=printing.length();
            }
            if(charsPrinted>19){
                System.out.println();
                charsPrinted = 0;
            }
            counter++;
            spacesBefore = -1;
        }
        while (counter<=days);
    }
    public static void main(String[] args){
        input();
        display();
    }
}
