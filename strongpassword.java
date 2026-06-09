/*write a program to check either the pasword is strong or not

1. check at least one capital letter
2.check at least one small letter
3.check at least one digit
4.check at least one symbl
5. check at least 8 chaacter


write a progam to input any string, count ,totalnumber of capital letter small letter digit and symbol */

import java.util.*;

class strongpassword{

String pass;

public static void main (String args[]){

	String pass;
	int lower,upper,digit,symbol;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your password :");
	pass=sc.next();
	
	lower=upper=digit=symbol=0;
	char ch;
	
	for(int i=0;i<pass.length();i++)
	{
		ch=pass.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			upper++;
		
		}
		else if(ch>='a'&&ch<='z')
		{
			lower++;
		
		}
		else if(ch>='0'&&ch<='9')
		{
			digit++;
		
		}
		else
		{
			symbol++;
		
		}
	}
	
	System.out.println("Upper  :"+upper);
	System.out.println("Lower  :"+lower);
	System.out.println("Digit  :"+digit);
	System.out.println("Symbol :"+symbol);

}
}