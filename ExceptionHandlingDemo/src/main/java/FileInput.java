import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileInput {
    public static void main(String[] args) {

        try{
            readFile();
        }
        //this method has to handle the exception
        //since this method calls readFile method that contains throws signature
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    //throws - signature of method for exception
    public static void readFile() throws FileNotFoundException {

        FileReader fileReader = new FileReader("test.txt");

    }
}
