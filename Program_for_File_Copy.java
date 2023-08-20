import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream source = new FileInputStream("source.txt");
            FileOutputStream destination = new FileOutputStream("destination.txt");
            int data;
            while ((data = source.read()) != -1) {
                destination.write(data);
            }
            source.close();
            destination.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
