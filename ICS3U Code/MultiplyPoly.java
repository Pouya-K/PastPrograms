import java.util.Arrays;

public class MultiplyPoly {
    static int[] arr1 = {1,-1, 3};
    static int[] arr2 = {2, 3, -1};
    public static int[] multiplyPoly(int[] p1, int[] p2){
        int[] p1p2;
        p1p2 = new int[p1.length+ p2.length-1];
        for(int i = 0; i< p1.length; i++){
            for(int i2 = 0; i2< p2.length; i2++){
                p1p2[i+i2] += p1[i]*p2[i2];
            }
        }
        return p1p2;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(multiplyPoly(arr1, arr2)));
    }
}
