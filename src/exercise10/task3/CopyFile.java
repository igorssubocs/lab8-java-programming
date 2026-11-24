package exercise10.task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int bajt;

        try (FileInputStream fis = new FileInputStream("test123.txt")) {
            try (FileOutputStream fout = new FileOutputStream("test123_copy.txt")) {
                do {
                    bajt = fis.read();
                    if (bajt == ' ') bajt = '-';
                    if (bajt != -1) fout.write(bajt);
                } while (bajt != -1);

                System.out.println("File copied to test123_copy.txt");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
