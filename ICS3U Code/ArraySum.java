import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args){
        int sum = 0;
        int[] squares = new int[10];
        for(int counter=0, i = 1;counter<squares.length; i++,counter++){
            squares[counter] = (i*i);
        }
        System.out.println(Arrays.toString(squares));
        for(int numbers:squares) sum += numbers;
        System.out.println("Sum of the array is: " + sum);
    }
}
