//wap to input a string check whether it contain at least @ and atleast"."


import java.util.*;

class checkMail{

public static void main (String args[]){
	
	String mail;
    int t,d;

	Scanner sc=new Scanner (System.in);
	System.out.print("Enter mail:");
	mail=sc.next();
	
	t=mail.indexOf("@");
	System.out.println("found at : "+t);
	
	d=mail.indexOf(".");
	System.out.println("found at : "+d);
	
	if(t==-1||d==-1)
	{
		System.out.print("invalid");
		
	}
	else
	{
		System.out.print("successful");
	}
		
	
}
}