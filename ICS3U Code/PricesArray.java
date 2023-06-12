import java.util.Arrays;
import java.util.Random;

public class PricesArray {
    public static void main(String[] args){
        Random rd = new Random();
        float[] prices = new float[10];
        for(int i = 0; i<prices.length; i++) prices[i] = Math.round((rd.nextFloat()*100.1f)*100f) / 100.0f;
        System.out.println("Original Prices: "+ Arrays.toString(prices));
        for(int i =0; i<prices.length; i++) prices[i] = Math.round((prices[i]*1.1f)*100) / 100.0f;
        System.out.println("Prices increased by 10%: "+ Arrays.toString(prices));
        for(int i = 0; i<prices.length; i++) prices[i] = Math.round((prices[i]-5.99f)*100) / 100.0f;
        System.out.println("Prices decreased by $5.99: "+ Arrays.toString(prices));
    }
}
