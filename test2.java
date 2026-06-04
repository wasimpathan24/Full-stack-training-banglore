/* 

During inheritance it may possible the name of the parent property and child property can be same . even local 
varible and arguments will be same it cause ambiguity(confusion).
To resolve this issue we have to differeciate this propety

To identify the parent property use super keyword
To identify the same class property use this keyword.

super = refer to parent class
this = refer to same class.

*/

class test1{
	
  int a;
	
}

class test2 extends test1{
	
	int a;
	
	void display(int a){
		
		
		
		
		super.a=a; //refer to parent of class test1
		this.a=a; // refer to variable of same class tet2

		
	    System.out.println("value of a \n : "+super.a);
		System.out.println("value of b \n : "+a);
	}
	
	public static void main (String args[]){
		
		test2 t= new test2 ();
		
		t.display(100);
	}
}

