package exercise9.task5;

public class Checker
{
    public static void first() throws MyException1, MyException2
    {
        throw new MyException1();
    }

    public static void second() throws MyException2
    {
        throw new MyException2();
    }
}
