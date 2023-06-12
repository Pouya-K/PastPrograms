public class PascalTriangle {
    public static int pascal(int n, int k){
        /*
        Explanation: This program will kind the k value at line n in Pascal's triangle. In short, the
                     recursive method  goes up the triangle, until it reaches the base case (top of the triangle).
                     From there, it starts moving down until it has all the values before n and k,
                     so it is able to compute what K is equal to. To find k, we need the two values
                     that add up to it, and to find those, we need the values before them, etc.
                     This means that we have to compute nearly the entire triangle.
         */
        if(k==0 || k==n) return 1; //Base Case
        else return pascal(n-1, k-1)+pascal(n-1,k); //Going up the triangle
    }
    public static void main(String[] args){
        System.out.print("The number that you are looking for in Pascal's triangle is: "+pascal(6,3));
    }
}
