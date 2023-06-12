import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort = {5,1,4,2,8,6,3,10,2};
    public static void bubbleSort(int[] arr){
        for(int i = 1; i<= arr.length-2; i++){
            for(int firstIndex = 0, secondIndex = 1; secondIndex< arr.length; firstIndex++,secondIndex++){
                int num1 = arr[firstIndex], num2 = arr[secondIndex];
                if(num1>num2){
                    arr[secondIndex] = num1;
                    arr[firstIndex] = num2;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        bubbleSort(bubbleSort);
    }
}
