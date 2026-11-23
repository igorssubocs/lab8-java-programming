package exercise9.task3;

public class NotEnoughMoneyException extends RuntimeException
{
    public NotEnoughMoneyException(String message)
    {
        super(message);
    }
}
