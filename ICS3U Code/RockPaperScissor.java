import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public RockPaperScissor(){}
    Random random = new Random();
    static int compMove = (int)(1.0+(Math.random()*4.0));
    String userMove;
    Scanner keyboard = new Scanner(System.in);
    public void input(){
        System.out.println("Enter your move (R for Rock, P for Paper, and S for Scissor)");
        userMove = keyboard.nextLine();
    }
    public void display(){
        int userMoveInt;
        if (userMove.charAt(0)=='R'){
            userMoveInt = 1;
        }
        else if (userMove.charAt(0)=='P'){
            userMoveInt = 2;
        }
        else {
            userMoveInt = 3;
        }

        //Comparing the user's move to the computer's move
        if (compMove == 1){
            if (userMoveInt == 1){
                System.out.println("The computer played rock, which means it's a draw!");
            }
            else if (userMoveInt == 2){
                System.out.println("The computer played rock, which means user wins!");
            }
            else {
                System.out.println("The computer played rock, which means computer wins!");
            }
        }
        else if (compMove == 2){
            if (userMoveInt == 2){
                System.out.println("The computer played paper, which means it's a draw!");
            }
            else if (userMoveInt == 3){
                System.out.println("The computer played paper, which means user wins!");
            }
            else {
                System.out.println("The computer played paper, which means computer wins!");
            }
        }
        else{
            if (userMoveInt == 3){
                System.out.println("The computer played scissor, which means it's a draw!");
            }
            else if (userMoveInt == 1){
                System.out.println("The computer played scissor, which means user wins!");
            }
            else {
                System.out.println("The computer played scissor, which means computer wins!");
            }
        }
    }
    public static void main(String[] args){
        RockPaperScissor r =  new RockPaperScissor();
        for (int i = 1; i<10; i++){
            compMove = (int)(1.0+(Math.random()*3.0));
            System.out.println(compMove);
        }
        //r.input();
        //r.display();
    }
}