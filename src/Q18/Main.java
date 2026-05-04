package Q18;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("Demo.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            Scanner input = new Scanner(System.in);
            System.out.print("Enter text to write into file: ");
            String data = input.nextLine();

            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("Data written to file.");

            Scanner reader = new Scanner(file);
            System.out.println("Reading file content:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("File not deleted.");
            }

            input.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}