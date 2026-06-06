/*final keyword can be use with method , vaiable , class

1.with variable ->   NO CHANGE
2.with class    ->   NO INHERITANCE
3.with method   ->   NO OVERRIDING


*/




class abc{

float pi=3.14f;

	void display(){
	
	System.out.println("method of parent class ");
	
	}
	
	void show(){
	
	System.out.println(" show of parent");	 
	
	}
}

class pqr extends abc{

	void view(){
	
	System.out.println("Value of pie is : "+pi);
	}
	
	void display(){
	
	System.out.println("Method of child class ");
	}
	
	public static void main(String args[]){
	
	pqr v =new pqr();
	
	v.view();
	v.display();
	
	}	
	
}



