package exercise9.task4;

public class Main {
    public static void main(String[] args) {
        ValueCheck checker = new ValueCheck();

        for (int value = 1; value <= 5; value++) {
            try {
                checker.check(value);
            } catch (FirstException | SecondException | ThirdException error) {
                System.out.println(error.getMessage());
            }
        }
    }
}