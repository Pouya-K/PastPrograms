import java.util.Arrays;

public class AddPoly {
    static int[] arr1 = {7,0,5,-2};
    static int[] arr2 = {0,1,-2,3,5,-1};
    public static int[] addPoly(int[] p1, int[] p2){
        int[] p1p2;
        int i = 0;
        if(p1.length> p2.length) {
            p1p2 = new int[p1.length];
            for(;i< p2.length;i++) p1p2[i] = p1[i]+p2[i];
            for(;i< p1.length; i++) p1p2[i] = p1[i];
        }
        else{
            p1p2 = new int[p2.length];
            for(;i< p1.length;i++) p1p2[i] = p1[i]+p2[i];
            for(;i< p2.length; i++) p1p2[i] = p2[i];
        }
        return p1p2;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(addPoly(arr1, arr2)));
    }
}
