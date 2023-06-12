import java.util.Arrays;

public class Intersection {
    static int[] user1 = {1, 2, 3, 4, 5, 6};
    static int[] user2 = {2,6,8,9,2};
    public static int[] intersection(int[] arr1, int[] arr2){
        String stringArr3 = "";
        for(int i = 0; i< arr1.length; i++){
            for(int i2 = 0; i2< arr2.length; i2++){
                if(arr1[i] == arr2[i2]){
                    stringArr3 += arr1[i] + " ";
                    break;
                }
            }
        }
        String[] arr3 = stringArr3.split(" ");
        int[] finalArr = new int[arr3.length];
        for(int i = 0; i< finalArr.length; i++){
            finalArr[i] = Integer.parseInt(arr3[i]);
        }
        return finalArr;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(intersection(user1, user2)));
    }
}
