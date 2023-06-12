import java.util.Scanner;
public class GuessTheNum {
    Scanner keyboard = new Scanner(System.in);
    double randNum = 20 + (Math.random()*100);
    Boolean guessedTheNum = false;
    public GuessTheNum()
    {
    }
    public void game()
    {
        for (int i = 1; i <= 5 && !guessedTheNum; i++) {
            randNum = (int) randNum;
            System.out.println(randNum);
            System.out.println("Enter your guess: ");
            double guess = keyboard.nextDouble();

            if (guess == randNum) {
                System.out.println("Congrats! You guessed the correct number. The number was " + randNum);
                guessedTheNum = true;
            } else if (guess > randNum) {
                System.out.println("Sorry, your guess is larger than the number, slow down!");
            } else {
                System.out.println("You guess was too low. Guess again.");
            }
        }
        if(!guessedTheNum)
        {
            System.out.println("Nice Try! The number was "+randNum+". Play again and try to guess a new number!");
        }
    }
    public static void main (String[] args)
    {
        GuessTheNum g = new GuessTheNum();
        g.game();
    }
}
