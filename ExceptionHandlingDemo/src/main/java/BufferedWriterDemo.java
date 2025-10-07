import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {

        //write file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))){

            writer.write("Hello World!");
            writer.newLine();
            writer.write("This is Java!");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //read file
        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
