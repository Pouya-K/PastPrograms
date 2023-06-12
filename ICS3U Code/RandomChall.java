public class RandomChall {
    public static void randomness(){
        //This method will take the sum of 100 random numbers between -10 and 10.
        double sum = 0; //Variable which holds the sum value
        for(int i=1; i<=100; i++){ //For loop which creates 100 random numbers and adds them
            double randNum = -10 + (Math.random()*21); //Finding a random number between -10 and 10
            int rand = (int) randNum; //Converting double type to int
            sum += rand; //Adding each random number to the total sum
        }
        System.out.println("The sum of 100 random numbers between -10 and 10 is "+ sum + ", and their average is "+sum/100);
    }
    public static void main(String[] args){
        randomness();
    }
}
