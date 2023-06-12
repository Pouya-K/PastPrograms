import java.io.*;
import java.util.Arrays;

public class Advent2 {
    public static void main (String[] args) throws IOException {
        BufferedReader adventReader = new BufferedReader(new FileReader(new File("Advent1.txt")));
        String line = "";
        int sum = 0;
        while((line = adventReader.readLine()) != null){
            char theirMove = line.charAt(0);
            char yourMove = line.charAt(2);
            if(theirMove == 'A'){
                if(yourMove == 'X') sum += 3; //Lose - Scissor
                else if (yourMove == 'Y') sum += 3 + 1; //Draw - Rock
                else if (yourMove == 'Z') sum += 6 + 2; //Win - Paper
            }
            if(theirMove == 'B'){
                if(yourMove == 'X') sum += 1; //Lose - Rock
                else if (yourMove == 'Y') sum += 3 + 2; //Draw - Paper
                else if (yourMove == 'Z') sum += 6 + 3; //Win - Scissor
            }
            if(theirMove == 'C'){
                if(yourMove == 'X') sum += 2; //Lose - Paper
                else if (yourMove == 'Y') sum += 3 + 3; //Draw - Scissor
                else if (yourMove == 'Z') sum += 6 + 1; //Win - Rock
            }
        }
        System.out.println(sum);
    }
}
