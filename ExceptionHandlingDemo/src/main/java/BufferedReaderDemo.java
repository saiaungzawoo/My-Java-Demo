import java.io.BufferedReader;
import java.io.FileReader;


public class BufferedReaderDemo {
    public static void main(String[] args) {

        //with try-with-resources, we don't need to close file connection manually.

        try(BufferedReader fileReader = new BufferedReader(new FileReader("story.txt"))){

            String line;
            //read the file
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
