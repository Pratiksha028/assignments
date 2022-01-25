package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) throws IOException
    
    {
        int ch;
          FileReader fr=null;
        try
        {
            fr = new FileReader("text");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
  
        fr.close();
    }

}
