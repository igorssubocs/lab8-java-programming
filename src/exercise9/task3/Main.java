package exercise9.task3;

public class Main
{
    public static void main(String[] args)
    {
        Account account1 = new Account(
                "Igors Subocs",
                1200,
                "PL12341234123412341234"
        );

        try
        {
            account1.transfer(150);
        }
        catch (NotEnoughMoneyException error)
        {
            System.out.println(error.getMessage());
        }
        catch (Exception error)
        {
            System.out.println(error);
        }
        finally
        {
            System.out.println(account1.getBalance());
        }
    }
}
