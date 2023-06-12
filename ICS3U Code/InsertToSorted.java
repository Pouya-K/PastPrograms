import java.util.Arrays;

public class InsertToSorted {
    static int[] sortedArr = {1,2,4,5,6,7,8,9};
    public static void insertToSorted(int[] arr, int newElement){
        int insertIndex = 0;
        for(int i = 0; i< arr.length; i++) {
            if(newElement<arr[i]){
                insertIndex = i;
                break;
            }
        }
        arr[insertIndex] = newElement;
        int[] newArr = Arrays.copyOf(arr,arr.length+1);
        for(int i=insertIndex+1; i<newArr.length; i++){
            newElement++;
            newArr[i] = newElement;
        }
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args){
        insertToSorted(sortedArr,3);
    }
}
