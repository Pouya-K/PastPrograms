import java.util.Scanner;

public class Taxes {
    Scanner keyboard = new Scanner(System.in);
    double income, tax, calculatingIncome;
    public Taxes(){}
    public void input(){
        System.out.println("Enter your yearly income:");
        income = keyboard.nextInt();
    }
    public void output(){
        if(income<20000){
            System.out.println("Your income is "+income+" which means you pay no taxes.");
        }
        else if(income>=20000 && income < 40000){
            calculatingIncome = income;
            income -= 20000;
            tax += income * 0.2;
            System.out.println("Your income is "+calculatingIncome+" dollars which means you pay $"+tax+"+ in taxes.");
        }
        else if(income>=40000){
            calculatingIncome = income;
            income -= 40000;
            tax = 20000*0.2;
            tax += income * 0.3;
            System.out.println("Your income is "+calculatingIncome+" dollars which means you pay $"+tax+" in taxes.");
        }
    }
    public static void main(String[] args){
        Taxes t = new Taxes();
        t.input();
        t.output();
    }
}
