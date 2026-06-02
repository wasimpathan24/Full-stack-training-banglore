import java.util.*;
class add{
	int a,b,c;
	void input(){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter first value :");
			a=sc.nextInt();
			
		System.out.print("Enter Second Value");
		b=sc.nextInt();
		
			
	}
	
	void sum(){
		
		c=a+b;
	}
	
	
	void display(){
		System.out.print("Sum is :"+c);
	}

public static void main (String s[]){
add t= new add();
t.input();
t.sum();
t.display();
}
	
}
