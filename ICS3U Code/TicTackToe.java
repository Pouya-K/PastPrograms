import java.util.Scanner;
public class TicTackToe {
    String gameNum;
    String firstPlayer ="", secondPlayer ="";
    char[] subOfFirst, subOfSecond;
    Scanner keyboard = new Scanner(System.in);
    Boolean oneWin, twoWin;
    public TicTackToe(){}
    public void getInput(){
        System.out.println("Enter the number equivalent of your game.");
        gameNum = keyboard.nextLine();
    }
    //public boolean win(String subString){
     //   String[] winningComb = {"123", "456", "789", "147", "258", "369", "159", "357"};
   // }
    public void output(){
        for(int i = 0; i<gameNum.length(); i+=2){
            String addingString = String.valueOf(gameNum.charAt(i));
            firstPlayer += addingString;
        }
        for(int i = 1; i<gameNum.length(); i+=2){
            String addingString = String.valueOf(gameNum.charAt(i));
            secondPlayer += addingString;
        }
        for(int i = 3; i<5; i++){
            subOfFirst = firstPlayer.substring(0,i).toCharArray();
            subOfSecond = secondPlayer.substring(0,i).toCharArray();
        }
    }
    public static void main(String[] args){
        TicTackToe t = new TicTackToe();
        t.getInput();
        t.output();
    }
}
