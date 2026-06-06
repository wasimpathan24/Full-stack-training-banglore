
// CONSTRUTOR OVERLOADING
import java.util.*;


class sum1{
	
	 sum1( int x, int y){
	
	System.out.print("Sum of int int   :" +(x+y));
	
	}
	
	sum1 (int x, int y, int z){
		System.out.print(" Sum of int int int :" +(x+y+z));
	
	}
	
	 sum1( float x, float y){
	
	System.out.print("Sum of float float  :" +(x+y));
	
	}
	
	
	sum1( float x, float y ,float z){
	
	System.out.print("Sum of float float float  :" +(x+y+z));
	
	}
	
	sum1( int x, float y){
	
	System.out.print("Sum of int float  :" +(x+y));
	
	}
	
	sum1( float x, int y){
	
	System.out.print("Sum of float int  :" +(x+y));
	
	}
	
	public static void main(String args[]){
	
		sum1 t1=new sum1 (100,200);
		sum1 t2=new sum1 (10,20,30);
		sum1 t3=new sum1 (40.23,50.67);
		sum1 t4=new sum1 (10.56,20.43,42.32);
		sum1 t5=new sum1 (70,22.4);
		sum1 t6=new sum1 (58.3,60);
		
		
	}
	

}