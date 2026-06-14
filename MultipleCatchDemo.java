class MultipleCatchDemo
{
    public static void main(String args[])
    {
        try
        {
            int arr[] = {10,20,30};

            System.out.println(arr[5]);

            int x = 10/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Error");
        }
    }
}