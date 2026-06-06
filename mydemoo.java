/*in inhritance in multiple class parent and child same name methods 

multiple same name methods

within different inherited classes but in the same structure , signature , arguments

with different functioning 

is calld

method overriding and implement the concpt of 

Run time polymorphism  



When we perform mehod overidding and it create a cndition of ambiguity because of same name methd 

resolve the situation 
with create a instance of extrme parent class and one by one we assign te rference of child class and wit the 
heplp of this instance we can call same name method only

means in below program there is an amiguity to call display method thats why we create a instance of demo1 class 
and with the help of this instance we call all the same name method 

this is called DYNAMIC METHOD DISPATCH( DMD )


*/



import java.util.*;

class demo1{

void show(){
	
	System.out.println("in show");

}

void display (){

	System.out.println("this is display of demo1 :");

}

}

class demo2 extends demo1 {

void view (){

System.out.println("In view");


}

void display (){
	
	//super.display();

	System.out.println("this is display of demo2 :");

}
}

class demo3 extends demo2{
void output(){

	System.out.println("In output ");

}

void display(){
	
	// super.display();

	System.out.println("this is display of demo3 :");

}

}

class mydemoo{

	public static void main(String args[]){
	
	demo3 d3 =new demo3();
	
	d3.show();
	d3.view();
	d3.output();
	
	demo1 d1;
	
	d1=new demo1();
	d1.display();

	
	//parent can refer to child can be assigned to parent
	
	d1=new demo2();  
	d1.display();
	
	d1=new demo3();
	d1.display();
	
	
	}
}
