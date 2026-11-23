package exercise9.task4;

public class ValueCheck
{
    public void check(int value) throws FirstException, SecondException, ThirdException
    {
        if (value == 1)
            throw new FirstException("FirstException, value = " + value);
        else if (value == 2)
            throw new SecondException("SecondException, value = " + value);
        else if (value == 3)
            throw new ThirdException("ThirdException, value = " + value);
        else
            System.out.println(value + " no exception");
    }
}
