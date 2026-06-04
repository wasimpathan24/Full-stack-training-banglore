
// CONSTRUTOR OVERLOADING



class sum1{
	 sum1( int x, int y){
	
	System.out.print("Sum of int int   :" +(x+y));
	
	}
	
	sum1 (int x, int y, int z){
		System.out.print(" Sum of int int int :" +(x+y+z));
	
	}
	
	 sum3( float x, float y){
	
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
		sum1 t2=new sum1 (100,200);
		sum1 t3=new sum1 (100,200);
		sum1 t4=new sum1 (100,200);
		sum1 t5=new adt (100,200);
		sum1 t6=new adt (100,200);
		
		
	}
	

}