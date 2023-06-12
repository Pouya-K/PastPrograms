import java.io.*;
import java.util.Arrays;
public class Advent6 {
    public static void main (String[] args) throws IOException {
        BufferedReader adventReader = new BufferedReader(new FileReader(new File("Advent1.txt")));
        String line = "";
        while ((line = adventReader.readLine()) != null) {
            for (int i = 0; i < line.length()-13; i++) {
                String substring = line.substring(i, i + 14);
                char[] sub = substring.toCharArray();
                Arrays.sort(sub);
                for(int j = 0; j< sub.length-1; j++){
                    if(sub[j] == sub[j+1]) break;
                    else if(j== sub.length-2) System.out.println(i+14);
                }
            }
        }
    }
}
