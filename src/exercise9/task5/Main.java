package exercise9.task5;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Checker.first();
        } catch (Exception error)
        {
            System.out.println(error);
        }

        try
        {
            Checker.second();
        } catch (Exception error)
        {
            System.out.println(error);
        }
    }
}