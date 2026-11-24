package exercise10.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BestStudents {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("studentsEN.txt", StandardCharsets.UTF_16)) {
            try (FileWriter fw = new FileWriter("studentsWithGrade5.txt")) {
                String line = "";
                int symbol;

                while ((symbol = fr.read()) != -1) {
                    if (symbol == '\n') {
                        if (line.trim().endsWith("5")) {
                            fw.write(line + "\n");
                        }
                        line = "";
                    } else {
                        line += (char) symbol;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
