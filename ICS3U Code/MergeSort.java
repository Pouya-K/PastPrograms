import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        int[] userArray = {1,5,3,4,2,6};
        System.out.println("Array before sorting " + Arrays.toString(userArray));
        System.out.println("Array after sorting " + Arrays.toString(mergeSort(userArray)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1) return arr;
        //using built in array class methods to split an array into 2
        int[] arr1= Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        return merge(arr1, arr2);
    }
    public static int[] merge(int[] arrA, int[] arrB){
        //Merging two sorted arrays together
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
            //One array is larger than the other (all remaining elements are in order)
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
        return mergedArr;
    }
}