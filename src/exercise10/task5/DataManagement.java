package exercise10.task5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataManagement {
    private String data;

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name and surname: ");

        data = scanner.nextLine();
    }

    public void writeDataToFile() {
        boolean isEmpty = new File("users.txt").length() == 0;

        try (FileWriter fw = new FileWriter("users.txt", true)) {
            if (!isEmpty) {
                fw.write("\n");
            }
            fw.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readDataFromFile() {
        try (FileReader fr = new FileReader("users.txt")) {
            int symbol;

            while ((symbol = fr.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
