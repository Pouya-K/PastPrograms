import java.util.Scanner;

public class RiemannSum {
    public RiemannSum(){}
    Scanner keyboard = new Scanner(System.in);
    double n, w, sum, a=1, b=2;
    public double function (double x){
        return x*x;
    }
    public void display(){
        System.out.println("Enter your end number (n): ");
        n = keyboard.nextDouble();
        w = (b-a)/n;
        for (int i = 0; i<n; i++){
            sum += w * function(a+i*w);
        }
        System.out.println("The Riemann sum approximation is: " + sum);
    }
    public static void main(String[] args){
        RiemannSum r = new RiemannSum();
        r.display();
    }
}
