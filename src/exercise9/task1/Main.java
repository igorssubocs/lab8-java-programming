package exercise9.task1;

public class Main {
    public static void main(String[] args) {
        NullGenerator generator = new NullGenerator();

        try {
            generator.generate();
        } catch (NullPointerException error) {
            System.out.println("Error");
            error.printStackTrace(System.out);
            System.out.println(error.toString());
        }
    }
}
