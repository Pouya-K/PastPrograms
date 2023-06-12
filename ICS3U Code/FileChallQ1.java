import java.io.*;
public class FileChallQ1 {
    public static void main (String[] args)
    {
        try
        {
            File folder = new File("C:\\Users\\345428130\\Documents\\intellij\\");
            String filenames[]=folder.list();
            System.out.println("All the files and directories in the folder are: \n");
            for (int i=0;i<filenames.length;i++) System.out.println(filenames[i]);
            System.out.println("\nAll of the regular files in the folder are: ");
            for(int i=0;i<filenames.length;i++){
                String fileLocation = "C:\\Users\\345428130\\Documents\\intellij\\" + filenames[i];
                File tempFile = new File(fileLocation);
                if(tempFile.isFile()){
                    System.out.println(filenames[i]);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace (); // if any I/O error occurs
        }
    }
}
