public class Decomposition {
    public static void decompose(int n){
        int fiveHundreds, hundreds, twenties, fives, ones;
        //$500 Bills
        fiveHundreds = n/500;
        n -= 500*fiveHundreds;
        //$100 Bills
        hundreds = n/100;
        n -= 100*hundreds;
        //$20 Bills
        twenties = n/20;
        n -= 20*twenties;
        //$5 Bills
        fives = n/5;
        n -= 5*fives;
        //$1 Bills
        ones = n;

        System.out.println("$500 -> " + fiveHundreds);
        System.out.println("$100 -> " + hundreds);
        System.out.println("$20 -> " + twenties);
        System.out.println("$5 -> " + fives);
        System.out.println("$1 -> " + ones);
    }
    public static void main(String[] args){
        decompose(12348);
    }
}
