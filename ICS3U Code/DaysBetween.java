import java.util.Arrays;
import java.util.Scanner;

public class DaysBetween {
    static int days = 0;
    static int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
    static Scanner keyboard = new Scanner(System.in);
    static int[] oldDate = new int[3];
    static int[] newDate = new int[3];
    public static void display(){
        System.out.println("Enter your first (older) date, in yyyy/mm/dd format: ");
        String firstDate = keyboard.nextLine();
        System.out.println("Enter your second (newer) date, in yyyy/mm/dd format: ");
        String secondDate = keyboard.nextLine();
        String[] temp1 = firstDate.split("/");
        for(int i = 0; i<3; i++) oldDate[i] = Integer.valueOf(temp1[i]);
        String[] temp2 = secondDate.split("/");
        for(int i = 0; i<3; i++) newDate[i] = Integer.valueOf(temp2[i]);
        System.out.println(Arrays.toString(oldDate));
        System.out.println(Arrays.toString(newDate));

        for(int i =oldDate[0]+1; i<newDate[0]; i++) {
            if (leapYear(i)) days += 366;
            else days += 365;
        }

        for(int i=oldDate[1];i<=11;i++) {
            if(leapYear(oldDate[0])&&i==1) days += 29;
            else days += day[i];
        }
        days += day[oldDate[1]-1]-oldDate[2];
        days += newDate[2];
        for(int i = 0; i<newDate[1]-1; i++) {
            if (leapYear(newDate[0]) && i == 1) days += 29;
            else days += day[i];
        }
        days++;
        System.out.print("The number of days from "+oldDate[0]+"/"+oldDate[1]+"/"+oldDate[2]);
        System.out.print(" to "+newDate[0]+"/"+newDate[1]+"/"+newDate[2]+" is "+days+" days.");
    }
    public static boolean leapYear (int year){
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
    public static void main(String[] args){
        display();
    }
}
