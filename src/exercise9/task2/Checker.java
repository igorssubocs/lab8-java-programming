package exercise9.task2;

public class Checker {
    public void check(int value) {
        if (value == 0)
            throw new ArithmeticException("value 0");
        else if (value == 1)
            throw new ArrayIndexOutOfBoundsException("value 1");
        else
            System.out.println(value + " no exception");
    }
}
