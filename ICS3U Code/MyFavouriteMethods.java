//Name: Pouya Karimi
//Date: October 22nd - October 28th, 2022
//Teacher: Mr. Gugoiu
//IDE: IntelliJ IDEA CE

public class MyFavouriteMethods {
    static int index = 0;

    public static void randomness(){
        double sum = 0; //Variable which holds the sum value
        for(int i=1; i<=100; i++){ //For loop which creates 100 random numbers and adds them
            double randNum = -10 + (Math.random()*21); //Finding a random number between -10 and 10
            int rand = (int) randNum; //Converting double type to int
            sum += rand; //Adding each random number to the total sum
        }
        //Output
        System.out.println("The sum of 100 random numbers between -10 and 10 is "+ sum + ", and their average is "+sum/100);
    }

    public static void simplify(int firstNum, int secondNum){ //Method which will simplify a number
        //Variable Declaration
        int numerator, denominator; //Input variables
        int lowerNum, upperNum, largestFactor=1;
        int positiveNum = Math.abs(firstNum), positiveDen = Math.abs(secondNum); //Variable which hold the absolute value of numbers
        //Checking which number is larger
        if(Math.abs(firstNum)>Math.abs(secondNum)){
            upperNum = Math.abs(firstNum);
            lowerNum = Math.abs(secondNum);
        }
        else {
            upperNum = Math.abs(secondNum);
            lowerNum = Math.abs(firstNum);
        }
        //Looping through every number to see which is the largest number
        for(int i = 1; i<=lowerNum; i++){
            if(upperNum%i == 0 && lowerNum%i == 0){
                largestFactor = i;
            }
        }
        //Display
        System.out.print(firstNum+"/"+secondNum+" = ");
        //Checking if the fraction should be negative
        if(firstNum<0 && secondNum>0){
            System.out.print("-");
        }
        else if(firstNum>0 && secondNum<0){
            System.out.print("-");
        }
        System.out.print(positiveNum / largestFactor + "/" + positiveDen / largestFactor);
    } //simplify

    public static boolean isPrime (int num) //Method which will check if a number is prime
    {
        //This method is called in two other methods.
        /*
        Explanation: Let's call a number n. N is prime if none of the numbers less than the square
                     root of n are a prime number. This program loops through every number smaller
                     than the square root of n, and checks if n is prime.
         */
        for (int i  = 2; i<= Math.sqrt(num); i++) //Looping through every number less than square root of n
        {
            if (num % i == 0 && i!=num)
            {
                return false;
            }
        }
        return true;
    } //isPrime
    public static void primeFactorize(int param){ //Method which will display the prime factorization
        System.out.println();
        //Local Variables
        String output;
        int checkPrime = 2, counter=0;
        System.out.print(param +" = ");
        while(param>1){ //Loop which will continue dividing the user's number by prime numbers
            if(isPrime(checkPrime) && param%checkPrime==0){ //Checking if the factor is prime
                counter = 0;
                while (param%checkPrime == 0){ //Checking how many times that prime number can divide into the number
                    counter++;
                    param/=checkPrime;
                }
                System.out.print("("+checkPrime+"^"+counter+")"); //Printing the current prime factor
            }
            checkPrime++; //Increasing the counter which will be checked to see if the factor is prime
        }
    } //Factorize

    public static void split(String splitter){
        System.out.println();
        for(int i = 0; i<splitter.length(); i++){ //Looping through every character of a string
            if(splitter.charAt(i)==' '){ //Checking if the character is a space
                System.out.println();
            }
            else{
                System.out.print(splitter.charAt(i)); //Printing each character as long as it is not a space
            }
        }
    }

    public static void line(double a, double b, double c){
        System.out.println();
        double xIntercept, yIntercept, slope, distanceToOrigin; //Variables which hold the answer values
        xIntercept = -(c/a); //Formula to calculate x intercept
        yIntercept = -(c/b); //Formula to calculate y intercept
        slope = yIntercept/(0-xIntercept); //Formula to calculate slope
        distanceToOrigin = Math.abs(c) / Math.sqrt(a*a+b*b); //Formula to calculate closest distance to origin
        //Output
        System.out.println("The X intercept is: " + xIntercept);
        System.out.println("The Y intercept is: " + yIntercept);
        System.out.println("The slope is: " + slope);
        System.out.println("The closest distance to the origin is: " + distanceToOrigin);
    }

    public static void randWord(){
        String word = "";
        for (int i = 1; i<=5; i++) { //Creating 5 characters
            int charNum = 65 + (int) (Math.random() * 26); //Generating a random number (ASCII value of a character)
            char addedChar = (char) charNum; //Converting a number (ASCII code) into a character
            word += addedChar; //Adding the character to a string (final word)
        }
        //Output
        System.out.print("Your random word is: " + word);
    }

    public static void printPrimes(int n){
        System.out.println();
        int counter = 1;
        System.out.println("The first " + n + " prime numbers are:");
        for(int i = 2; counter<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }
    }

    public static void decompose(int n){
        int fiveHundreds, hundreds, twenties, fives, ones;
        //$500 Bills
        fiveHundreds = n/500; //Total number of $500 bills
        n -= 500*fiveHundreds; //Amount after taking away the $500 bills
        //$100 Bills
        hundreds = n/100; //Total number of $100 bills
        n -= 100*hundreds; //Amount after taking away the $100 bills
        //$20 Bills
        twenties = n/20; //Total number of $20 bills
        n -= 20*twenties; //Amount after taking away the $20 bills
        //$5 Bills
        fives = n/5; //Total number of $5 bills
        n -= 5*fives; //Amount after taking away the $5 bills
        //$1 Bills
        ones = n; //Total number of $1 bills

        System.out.println("$500 -> " + fiveHundreds);
        System.out.println("$100 -> " + hundreds);
        System.out.println("$20 -> " + twenties);
        System.out.println("$5 -> " + fives);
        System.out.println("$1 -> " + ones);
    }

    public static int sum(long n){
        index++; //Adding one to the index
        String numb = Long.toString(n); //Converting our number to a string to be able to use string methods
        //Base Case
        if(index==numb.length()) return Character.getNumericValue(numb.charAt(0));
        else {
            int num = Character.getNumericValue(numb.charAt(index)); //Getting each digit at a specific index
            return num + sum(n); //Adding all the digits using recursion
        }
    }

    public static int pascal(int n, int k){
        if(k==0 || k==n) return 1; //Base Case
        else return pascal(n-1, k-1)+pascal(n-1,k); //Going up the triangle
    }

    public static void main(String[] args){
        //Lesson 1

        /*Explanation: This method will take the sum of 100 random numbers between -10 and 10 using
        the Math.random() method. */
        randomness(); //Sum of 100 numbers between -10 and 10
        //Lesson 2

        /*
        Explanation: The goal is to check what the largest factor is that divides evenly into both
                     the numerator and the denominator. To check, we start from 1, and go up to the
                     smaller number between the numerator and the denominator. In case one of them is
                     negative, we take the absolute value of both. We then find which one is bigger and
                     which one is smaller. The loop then runs until our counter is equal to the smaller number.
                     Everytime a number is a factor of both numbers, it is stored in a variable. At the end of
                     the loop, both numbers are divided by the largest factor, which is displayed as the simplified form.
         */
        simplify(336,42); //Simplifying a fraction
        /*
        Explanation: The loop will loop through all numbers, starting from 2, the smallest prime number.
                     If the number is both prime and a factor of the user's number, we enter the inner loop.
                     In the inner loop, we check how many times that factor can be divided into the user's
                     number.
         */
        primeFactorize(2387); //Prime factorization of a number
        /*
        Explanation: In short, this program will go through every character in a string.
                     If it finds a space, it will enter a new line.
         */
        split("This is a test string."); //Splitting a text onto new lines

        //Lesson 3

        /*
        Explanation: This program will take three different double values, a, b, c, which represent
                     the equation: aX + bY + c = 0, the equation of a line. We can find the X intercept,
                     Y intercept, slope, and the closest distance to the origin from that equation.
         */
        line(3, 2, -4); //All the properties of a line based on Ax + By + C = 0
        /*
        Explanation: This program will generate 5 random characters which are upper case letters.
                     It will then put those 5 characters together to form a random word.
         */
        randWord(); //Generating a random word

        //Lesson 4
        /*
        Explanation: This program will loop through every number, until it has printed n primes.
                     It will then use another method to check if the number is prime. If the
                     number is prime, then it will add one to the counter and print the prime
                     number. If not, it will just move onto the next number and check if it is prime.
         */
        printPrimes(8); //Printing the first N prime numbers
        /*
        Explanation: This method will take an integer and see how it can be split into $500, $100
                     $20, $5, and $1 bills using the least amount of notes. That means that we start
                     with the largest bill and try to make most of the money with that. Then we move
                     onto the smaller bill until we reach 1. The program first checks how many of those
                     bills can be made from the total, and then subtracts that amount from the original
                     money, giving us a new total to check.
         */
        decompose(12348); //Making a number from different bills

        //Lesson 5
        /*
        Explanation: This program will calculate the sum of the digits in a number. To do this,
                     the program has a recursive method. Each time the method is run, the program
                     finds the digit in the next index. For example, in the first running, the
                     method will find the first digit in the number, then the second, and so on.
                     The method will end when the index is equal to the length of the larger number.
         */
        System.out.println("The sum of the digits is: "+sum(293487)); //Finding the sum of the digits of a number
        /*
        Explanation: This program will kind the k value at line n in Pascal's triangle. In short, the
                     recursive method  goes up the triangle, until it reaches the base case (top of the triangle).
                     From there, it starts moving down until it has all the values before n and k,
                     so it is able to compute what K is equal to. To find k, we need the two values
                     that add up to it, and to find those, we need the values before them, etc.
                     This means that we have to compute nearly the entire triangle.
         */
        System.out.print("The number that you are looking for in Pascal's triangle is: "+pascal(6,3)); //Computing a number in Pascal's Triangle
    } //Main Method
}
