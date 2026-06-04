import java.util.*;

class square{
	int a,b,sq;
	
	void input(){
		
    Scanner sc=new Scanner(System.in);
	System.out.print("enter first value : ");
	a=sc.nextInt();
	
	System.out.print("enter second value : ");
	b=sc.nextInt();
	
	}
	
	void process(){
		
	sq=(a+b)*(a+b);
	
	}
	
	void display(){
		
		System.out.print("square is : " +sq);
	}
	
	
	public static void main(String args[]){
		
		square s=new square ();
		
		s.input();
		s.process();
		s.display();
	}
	n
	
	
	


}