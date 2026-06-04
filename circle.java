import java.util.*;
  
// functionl class because niether input nor output.  
  
  
abstract class clc{
	final float pi=3.14f;  // value change nhii hogi isliye FINAL LIKHA hai
	int square(int r)
	
	{
		return (r*r);
	
	}
	abstract void area(); //method declaration 
}

class circle extends clc{        //restricted

	int r;                   
	float ar;
	
	void input(){
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter radius :\n");
		r=sc.nextInt();
	
	}
	
	void area1 (){
	ar= pi*square(r);
	
	}
	
	void display (){
		System.out.print("Area Of Circle is : \n"+ar);
	
	}
	
	
	public static void main(String args[]){
	
		circle c = new circle ();
		
		
		c.pi();
		c.square();
		c.input();
		c.area();
		c.display();
	
	}
	



}