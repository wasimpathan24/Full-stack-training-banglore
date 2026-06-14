class CompleteException
{
    static void checkMarks(int marks) throws Exception
    {
        if(marks < 35)
        {
            throw new Exception("Fail");
        }

        System.out.println("Pass");
    }

    public static void main(String args[])
    {
        try
        {
            checkMarks(20);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Program Ended");
        }
    }
}