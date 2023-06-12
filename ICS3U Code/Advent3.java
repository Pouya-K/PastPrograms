import java.io.*;
import java.util.Arrays;
public class Advent3 {
    public static void main (String[] args) throws IOException {
        BufferedReader adventReader = new BufferedReader(new FileReader(new File("Advent1.txt")));
        String line = "";
        String characters = ",abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;
        int counter = 1;
        char chosen = ',';
        String part1 = "", part2 = "", part3 = "";
        while((line = adventReader.readLine()) != null){
            if(counter == 1){
                part1 = line;
                counter++;
            } else if (counter == 2) {
                part2 = line;
                counter++;
            }
            else {
                part3 = line;
                counter = 1;
                for(int i = 0; i<part3.length(); i++){
                    chosen = part3.charAt(i);
                    if(part1.indexOf(chosen) != -1 && part2.indexOf(chosen) != -1){
                        sum += characters.indexOf(chosen);
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
