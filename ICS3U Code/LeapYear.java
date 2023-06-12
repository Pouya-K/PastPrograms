import java.util.Scanner;

public class LeapYear {
    public LeapYear(){}
    Scanner keyboard = new Scanner(System.in);
    int inputYear;
    public void input(){
        System.out.print("Enter your year: ");
        inputYear = keyboard.nextInt();
    }
    public boolean leapYear (int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public void display(){
        if(leapYear(inputYear)){
            System.out.print("Your year is a leap year.");
        }
        else{
            System.out.print("Your year is not a leap year.");
        }
    }
    public static void main (String[] args) {
        LeapYear l = new LeapYear();
        l.input();
        l.display();
    }
}
