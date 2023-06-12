public class DigitsSum {
    static int index = 0;
    public static int sum(long n){
        /*
        Explanation: This program will calculate the sum of the digits in a number. To do this,
                     the program has a recursive method. Each time the method is run, the program
                     finds the digit in the next index. For example, in the first running, the
                     method will find the first digit in the number, then the second, and so on.
                     The method will end when the index is equal to the length of the larger number.
         */
        index++; //Adding one to the index
        String numb = Long.toString(n); //Converting our number to a string to be able to use string methods
        //Base Case
        if(index==numb.length()) return Character.getNumericValue(numb.charAt(0));
        else {
            int num = Character.getNumericValue(numb.charAt(index)); //Getting each digit at a specific index
            return num + sum(n); //Adding all the digits using recursion
        }
    }
    public static void main(String[] args){
        System.out.print(sum(293487));
    }
}
