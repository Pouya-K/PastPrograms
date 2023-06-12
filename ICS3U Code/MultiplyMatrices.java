import java.util.Arrays;

public class MultiplyMatrices {
    static int aRows = 3, aColumns = 4, bRows = 4, bColumns = 3;
    static int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    static int[][] arr2 = {{1,2,3},{4,5,6}, {7,8,9}, {10,11,12}};
    public static void multiplyMatrices(int[][] a, int[][] b){
        if(aColumns == bRows){
            int r = aRows;
            int c = bColumns;
            int[][] finalArr = new int[r][c];
            for(int i = 0; i<aRows; i++){
                for(int j = 0; j<bColumns; j++){
                    int adding = 0;
                    for(int k = 0; k<bRows; k++){
                        adding += arr1[i][k] * arr2[k][j];
                        finalArr[i][j] = adding;
                    }
                }
            }
            System.out.println(Arrays.deepToString(finalArr));
        }
        else System.out.println("Invalid array sizes. Matrices cannot be multiplied.");
    }
    public static void main(String[] args){
        multiplyMatrices(arr1, arr2);
    }
}
