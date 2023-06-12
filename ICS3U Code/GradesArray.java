import java.util.Arrays;
import java.util.Scanner;

public class GradesArray {
    static Scanner keyboard = new Scanner(System.in);
    static int numOfGrades;
    public static void main(String[] args){
        System.out.print("Enter the number of grades you wish to enter: ");
        numOfGrades = keyboard.nextInt();
        float[] gradeArray = new float[numOfGrades];
        for(int i = 0; i<gradeArray.length; i++){
            System.out.print("Enter grade "+(i+1)+": ");
            float grade = keyboard.nextFloat();
            gradeArray[i] = grade;
        }
        System.out.println(Arrays.toString(gradeArray));
        float averages = 0;
        for(float grades: gradeArray) averages += grades;
        System.out.println("The average of your grades is " + (averages/gradeArray.length));
    }
}
