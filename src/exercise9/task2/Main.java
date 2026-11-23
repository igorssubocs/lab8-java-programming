package exercise9.task2;

public class Main {
    public static void main(String[] args)
    {
        Checker thrower = new Checker();

        for (int value = 0; value <= 2; value++)
        {
            try
            {
                thrower.check(value);
            }
            catch (ArithmeticException error)
            {
                System.out.println(error);
            }
            catch (ArrayIndexOutOfBoundsException error)
            {
                System.out.println(error);
            }
            finally
            {
                System.out.println("Finally");
            }
        }
    }
}
