import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args){
        Random rd = new Random();
        float[] randomNumbers = new float[20];
        for(int i = 0; i<randomNumbers.length; i++) randomNumbers[i] = 10.0f+rd.nextFloat()*90.1f;
        System.out.println(Arrays.toString(randomNumbers));
        float smallestNum = 100.0f;
        for(float numbers : randomNumbers) if(numbers<smallestNum) smallestNum = numbers;
        System.out.println("The smallest number in the array is: " + smallestNum);
    }
}
