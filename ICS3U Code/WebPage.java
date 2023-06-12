import java.io.*;
public class WebPage {
    public static void webPage(String file) throws IOException {
        FileWriter writer = new FileWriter("Webpage.html", true);
        String[] randText = file.split("\\.");
        writer.write("<html>");
        writer.write("\r\n");
        writer.write("<body>");
        writer.write("\r\n");
        writer.write("<p>");
        writer.write("\r\n");
        writer.write("<ol>");
        writer.write(randText[0]);
        for(int i = 1; i< randText.length; i++){
            writer.write("\r\n");
            writer.write("<li>");
            writer.write(randText[i]);
        }
        writer.write("\r\n");
        writer.write("</ol>");
        writer.write("\r\n");
        writer.write("</p>");
        writer.write("\r\n");
        writer.write("</html>");
        writer.write("\r\n");
        writer.write("</body>");
        writer.close();
    }
    public static void main(String[] args){
        String txtFile = "";
        try {
            File randFile = new File("random.txt");
            FileReader reader = new FileReader(randFile);
            int ch;
            while((ch = reader.read()) != -1) txtFile += (char)ch;
            webPage(txtFile);
        }
        catch (IOException e) {
            e.printStackTrace ();}
    }
}
