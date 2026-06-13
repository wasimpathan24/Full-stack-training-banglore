//error = 2 types of error 

/*1. compile time error -> error occur during compilation program not able execute it any case.
2. run time error -> these

will abnormally terminate our code .
but here we want that normal program termination and error prome statement 
and its dependent must be skiped and remaining line of code must executed .

this is called EXCEPTION HANDLING

java give us 5 keywords this purpose :

1.TRY  block, in which be write error prome its dependent statement,it automatically throw the erro when err 
2.CATCH block, it hold the error thrown by try block and now error will defuse here error in remainng . a try can have mltiple catch blcok to hold different diff types of error .
3.THROW statement , use to throw the error in try block , genrally is by default available in try block.
4.THROWS statement, use to throw CHECKED exception in java .
5.FINALLY block , use to give the asurity to the statement that it will ececute n surity . but they must not contain any error . this block alwas required try and catch block .

exception :

1.checked ->  this exp. is already checked by java means that can contain error in runtime no any role of user . this exception either has to be throws or must be execution 
2.unchecked -> this may be genrated will be user . they must be handle by try and catch . 




*/




class myCode
{
	public static void main(String s[])
	//throws Exception
	{
		System.out.println("loading...");
		try{
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		System.out.println("My name is wasim  ");
		
	}
}