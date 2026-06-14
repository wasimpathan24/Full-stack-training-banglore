class FinallyDemo
{
    public static void main(String args[])
    {
        try
        {
            int x = 10/2;

            System.out.println("Result = " + x);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurred");
        }
        finally
        {
            System.out.println("Finally Block Executed");
        }
    }
}