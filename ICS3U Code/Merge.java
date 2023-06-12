import java.util.Arrays;

public class Merge {
    static int[] arr1 = {-7,-4,0,12,17,29,41,56,79};
    static int[] arr2 = {-9,-3,0,5,19, 23,48};
    public static void merge(int[] arrA, int[] arrB){
        int[] mergedArr = new int[arrA.length+ arrB.length];
        int arrAIndex = 0, arrBIndex = 0;
        for(int i = 0; i< mergedArr.length; i++){
            if(arrA[arrAIndex]<arrB[arrBIndex]){
                mergedArr[i] = arrA[arrAIndex];
                arrAIndex++;
            }
            else{
                mergedArr[i] = arrB[arrBIndex];
                arrBIndex++;
            }
            if(arrAIndex==arrA.length){
                while(arrBIndex<arrB.length){
                    i++;
                    mergedArr[i] = arrB[arrBIndex];
                    arrBIndex++;
                }
                break;
            }
            if(arrBIndex==arrB.length){
                while(arrAIndex<arrA.length){
                    i++;
                    mergedArr[i] = arrA[arrAIndex];
                    arrAIndex++;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(mergedArr));
    }
    public static void main(String[] args){
        merge(arr1, arr2);
    }
}
