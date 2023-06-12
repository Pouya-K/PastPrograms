public class Determinant {
    static int sign = 1;
    static int[][] test = {{7,2,8,9},
                           {2,3,13,6},
                           {5,12,11,4},
                           {8,4,6,15}};
    public static int det(int[][] matrix){
        int determinant = 0;
        if(matrix.length == 1) return matrix[0][0];
        for(int i = 0; i<matrix[0].length; i++){
            determinant += Math.pow(-1,i) * (matrix[0][i] * det(matrixRC(matrix,1,i+1)));
        }
        return determinant;
    }

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
        System.out.println(det(test));
    }
}
