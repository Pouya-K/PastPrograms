public class RandomChall {
    static double sum;
    public static void randomness(){
        for(int i=1; i<=100; i++){
            double randNum = -10 + (Math.random()*21);
            int rand = (int) randNum;
            System.out.println(rand);
            sum += rand;
        }
        //System.out.println("The sum of 100 random numbers between -10 and 10 is "+ sum + ", and their average is "+sum/100);
    }
    public static void main(String[] args){
        randomness();
    }
}
