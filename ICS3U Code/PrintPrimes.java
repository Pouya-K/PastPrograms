public class PrintPrimes {
    public static boolean isPrime (int num) //Method which will check if a number is prime
    {
        for (int i  = 2; i<= Math.sqrt(num); i++)
        {
            if (num % i == 0 && i!=num)
            {
                return false;
            }
        }
        return true;
    } //isPrime
    public static void printPrimes(int n){
        int counter = 1;
        System.out.println("The first " + n + " prime numbers are:");
        for(int i = 2; counter<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }
    }
    public static void main(String[] args){
        printPrimes(4);
    }
}
