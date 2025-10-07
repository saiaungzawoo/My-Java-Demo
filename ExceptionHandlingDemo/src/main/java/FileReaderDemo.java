import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        //init
        FileReader fileReader = null;

        try {
            //connect to a new file
           fileReader = new FileReader("story.txt");

           //create char
            //default
            int character;

            //-1 means end of file
            while((character = fileReader.read()) != -1){
                System.out.print((char)(character)); //cast UTF-8 to char
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist.");
        }
        finally {
            //if the try block fails, fileReader will stay null
            //can't close the fileReader if FR is null
            if(fileReader != null){
                fileReader.close();
            }

        }
    }
}
