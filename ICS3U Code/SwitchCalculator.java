import java.util.Scanner;

public class SwitchCalculator {
    public SwitchCalculator(){}
    Scanner keyboard = new Scanner(System.in);
    double firstOperand, secondOperand;
    String operator;
    char charOperator;
    public void input(){
        System.out.print("Enter your first operand:");
        firstOperand = keyboard.nextDouble();
        System.out.print("Enter your second operand:");
        secondOperand = keyboard.nextDouble();
        System.out.print("Enter your operator:");
        operator = keyboard.next();
        charOperator = operator.charAt(0);
    }
    public void display(){
        switch (charOperator){
            case '+':
                System.out.println(firstOperand +" + "+secondOperand+" = "+ (firstOperand+secondOperand)); break;
            case '-':
                System.out.println(firstOperand +" - "+secondOperand+" = "+ (firstOperand-secondOperand)); break;
            case '*':
                System.out.println(firstOperand +" * "+secondOperand+" = "+ (firstOperand*secondOperand)); break;
            case '/':
                System.out.println(firstOperand +" / "+secondOperand+" = "+ (firstOperand/secondOperand)); break;
            case '%':
                System.out.println(firstOperand +" % "+secondOperand+" = "+ (firstOperand%secondOperand)); break;
            case '^':
                System.out.println(firstOperand +" ^ "+secondOperand+" = "+ (Math.pow(firstOperand,secondOperand))); break;
            default:
                System.out.println("Operator is unrecognized.");
        }
    }
    public static void main(String[] args){
        SwitchCalculator s =  new SwitchCalculator();
        s.input();
        s.display();
    }
}
