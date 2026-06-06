import java.util.*;

class test1{

	void show(){
	
	System.out.print(" in show");
	
	
	}
	
	void display(){
	
	System.out.print("in display");
	
	
	}
}

class test2 extends test3{

	void view(){
	
	System.out.print("in view");
	
	
	
	}

    void display(){
	
	System.out.print("in display");

}

}

class test3 extends test2{

	void output(){
	
	System.out.println("in output");
	
	
	}
	
	void display(){
	
	System.out.println(" in display");
	
	
	}

}  

	class test4 extends test3{
	
		void vision(){
		
		System.out.println("in vision");
		
		}
		
		
		void display(){
		
		System.out.println("in display");
		
		}

	
	}
	
class mydemo12{


	public static void main(String args[]){
	
	test4 t4 =new test4();
	
	t4.show();
	t4.view();
	t4.output();
	t4.vision();
	
	test1 t1;
	
	t1=new test1();
	t1.display()
	
	
	}
}
	
	
	