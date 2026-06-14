class ExceptionDemo
{
    // throws keyword
    static void checkAge(int age) throws Exception
    {
        if(age < 18)
        {
            // throw keyword
            throw new Exception("You are not eligible to vote.");
        }
        else
        {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String args[])
    {
        try
        {
            checkAge(15);
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        finally
        {
            System.out.println("Finally block executed.");
        }
    }
}