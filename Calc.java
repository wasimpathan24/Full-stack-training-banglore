import java.util.*;

class Calc{
	int a,b,add,sub,mul,div;
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Value");
		a=sc.nextInt();
		
		System.out.print("Enter Second Value :");
		b=sc.nextInt();
		
	}
	
	void process(){
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		
	}
	void display(){
		System.out.print("addition: "+add);
		System.out.print("\nsubstraction: "+sub);
		System.out.print("\nmultipication: "+mul);
		System.out.print("\ndivisible: "+div);
		
		
	}
	
	public static void main(){
		Calc c= new Calc();
		c.input();
		c.process();
		c.display();
	}
	
}