when a class contain multiple same name method but they differ by 
no. of arguments 
types of arguments
sequence of argument 

this is called method overloading.

Use to implement compile time polymorphisms
with the help of this by using the single name we can perform multiple acivities so no nee work with multiple methods
of different name .





import java.util.*;

class adt{
	void sum( int x, int y){
	
	System.out.print("Sum of int int   :" +(x+y));
	
	}
	
	void sum (int x, int y, int z){
		System.out.print(" Sum of int int int :" +(x+y+z))
	
	}
	
	void sum( float x, float y){
	
	System.out.print("Sum of float float  :" +(x+y));
	
	}
	
	
	void sum( float x, float y ,float z){
	
	System.out.print("Sum of float float float  :" +(x+y+z));
	
	}
	
	void sum( int x, float y){
	
	System.out.print("Sum of int float  :" +(x+y));
	
	}
	
	void sum( float x, int y){
	
	System.out.print("Sum of float int  :" +(x+y));
	
	}
	
	public static void main(String args[]){
	
		adt t=new adt ();
		
		t.sum(10,20);
		t.sum(100,200,300);
		t.sum(10.0f,20.0f);
		t.sum(100.0f,200.0f,300.0f);
		t.sum(30,40.0f);
		t.sum(50.0f,60);
		
		
	}
	

}