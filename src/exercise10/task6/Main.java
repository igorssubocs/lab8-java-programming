package exercise10.task6;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 3 digits of bank account: ");

        String digits = scanner.nextLine();
        URL slug = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");

        try (InputStreamReader isr = new InputStreamReader(slug.openStream())) {
            String line = "";
            int symbol;

            while ((symbol = isr.read()) != -1) {
                if (symbol == '\n') {
                    String[] parts = line.split("\t");
                    String num = parts[0].trim(), name = parts[1];

                    if (num.equals(digits)) {
                        System.out.println("Your bank " + name);
                        break;
                    }

                    line = "";
                } else {
                    line = (line + (char) symbol);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
