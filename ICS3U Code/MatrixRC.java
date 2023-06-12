import java.util.Arrays;

public class MatrixRC {
    static int[][] practice = {{1,2,-3,4},{0,-1,2,5},{3,-2,1,0},{1,2,3,4}};
    public static int[][] matrixRC(int[][] arr, int r, int c){
        int[][] newArr = new int[arr.length-1][arr[0].length-1];
        for(int i = 0, newArrR = -1; i< arr.length&&newArrR<arr.length-1;i++){
            if(i!=r-1) newArrR++;
            for(int j = 0, newArrC = 0; j<arr[0].length&&newArrC<arr[0].length-1;j++){
                if(i!=r-1 && j!=c-1){
                    newArr[newArrR][newArrC] = arr[i][j];
                    newArrC++;
                }
            }
        }
        return newArr;
    }
    public static void main(String[] args){
        System.out.println(matrixRC(practice, 3, 2));
    }
}
