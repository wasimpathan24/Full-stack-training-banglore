import java.util.*;

class DateTime
{
	Date d=new Date();
	void date()
	{
		System.out.println(d.getDate());
	}
	
	void time()
	{
		while(true)
		{
			d=new Date();
			System.out.print("\r"+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		}
	
	}
	void day()
	{
		int ch=d.getDay();
		switch(ch)
		{
			case 0:
			System.out.println("Sunday");
			break;
			
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
			System.out.println("Tuesday");
			break;
			
			case 3:
			System.out.println("Wednesday");
			break;
			
			case 4:
			System.out.println("Thrusday");
			break;
			
			case 5:
			System.out.println("Friday");
			break;
			
			case 6:
			System.out.println("Saturday");
			break;
		}
		
	}
	
	void month()
	{
		int ch=d.getMonth();
		switch(ch)
		{
			case 0:
			System.out.println("January");
			break;
			
			
			case 1:
			System.out.println("Feburary");
			break;
			
			case 2:
			System.out.println("March");
			break;
			
			
			case 3:
			System.out.println("April");
			break;
			
			
			case 4:
			System.out.println("May");
			break;
			
			
			case 5:
			System.out.println("June");
			break;
			
			
			case 6:
			System.out.println("July");
			break;
			
			
			case 7:
			System.out.println("August");
			break;
			
			
			case 8:
			System.out.println("September");
			break;
			
			
			case 9:
			System.out.println("October");
			break;
			
			
			case 10:
			System.out.println("November");
			break;
			
			
			case 11:
			System.out.println("December");
			break;
			
			
			
		}
	}
	void year()
	{
		System.out.println(d.getYear()+1900);
	}
	
	
	public static void main(String s[])
	{
		DateTime dt=new DateTime();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("\nChoose:");
		System.out.println("1.For Date");
		System.out.println("2.For Time");
		System.out.println("3.For Day");
		System.out.println("4.For Month");
		System.out.println("5.For Year");
		System.out.println("6.Exit");
		int choice=sc.nextInt();
		
		
		
		
		switch(choice)
		{
			case 1:
			System.out.println("Output:");
			dt.date();
			break;
			
			case 2:
			System.out.println("Output:");
			dt.time();
			break;
			
			case 3:
			System.out.println("Output:");
			dt.day();
			break;
			
			case 4:
			System.out.println("Output:");
			dt.month();
			break;
			
			case 5:
			System.out.println("Output:");
			dt.year();
			break;
			
			case 6:
			System.exit(0);
		}
		
	}
}