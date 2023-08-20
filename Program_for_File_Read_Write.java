import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File Handling!");
            writer.close();
            
            // Reading from a file
            FileReader reader = new FileReader("output.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
