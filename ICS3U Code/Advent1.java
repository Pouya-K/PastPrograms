import java.io.*;
import java.util.Arrays;

public class Advent1 {
    public static void main (String[] args) throws IOException{
        BufferedReader adventReader = new BufferedReader(new FileReader(new File("Advent1.txt")));
        String line = "";
        String tempLine = "";
        int[] max = {0,0,0};
        while((line = adventReader.readLine()) != null){
            if(line.length() == 0){
                int tempSum = 0;
                String[] temp = tempLine.split(" ");
                for(int i = 0; i<temp.length; i++){
                    tempSum += Integer.parseInt(temp[i]);
                }
                if(tempSum>=max[0]) {
                    max[2] = max[1];
                    max[1] = max[0];
                    max[0] = tempSum;

                }
                else if (tempSum>=max[1]){
                    max[2] = max[1];
                    max[2] = tempSum;
                }
                else if (tempSum>=max[2]){
                    max[2] = tempSum;
                }
                tempLine = "";
            }
            else{
                tempLine += line + " ";
            }
        }
        System.out.println(max[0] + max[1] + max[2]);
    }
}
