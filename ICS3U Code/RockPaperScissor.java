import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public RockPaperScissor(){}
    Random random = new Random();
    int compMove = random.nextInt(2) + 1;
    String userMove;
    Scanner keyboard = new Scanner(System.in);
    public void input(){
        System.out.println("Enter your move (R for Rock, P for Paper, and S for Scissor)");
        userMove = keyboard.nextLine();
    }
}
