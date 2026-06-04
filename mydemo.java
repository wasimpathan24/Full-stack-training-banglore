
class demo1{
	demo1(){
		System.out.print("this is demo 1:");
		
	}
	
	void display1{
		
		System.out.print("this is display1 demo1");
	}
	
	
}

class demo2 extends demo1{
	demo2(){
		System.out.print("this is demo 2:");
		
	}
	
	void display2{
		
		System.out.print("this is display2 demo2");
	}
	
	
}

class demo3 extends demo2{
	demo3(){
		System.out.print("this is demo 1:");
		
	}
	
	void display3{
		
		System.out.print("this is display3 demo3");
	}
	
	
}

class demo4 extends demo3{
	demo4(){
		System.out.print("this is demo 4:");
		
	}
	
	void display4{
		
		System.out.print("this is display4 demo4");
	}
	
	
}

class mydemo{
	
	public static void main(String args[]){
		
		
		demo4 d4=new demo4 ();
		
		d4.display4();
		d4.display2();
		d4.display3();
		d4.display1();
		
		
	}
}