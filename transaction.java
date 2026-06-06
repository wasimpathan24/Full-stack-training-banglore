import java.util.*;

class account{	

int AccNum;
string CustName;
double Balance;

void input(){
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Enter your account number : ");
	AccNum=sc.nextInt();
	
	System.out.print("Enter Customer name : ");
	CustName=sc.nextInt();
	
	System.out.print("Enter Balance : ");
	Balance=sc.nextInt();
	
}
		
}

class transaction extends account{

	double amount;
	
	void withdrawl(){
	
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter amount to withdrawl : ");
	    amount=sc.nextInt();
		
		
	}

}