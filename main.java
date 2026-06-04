/*

RELATIONSHIP :

To reduce the complexity of code we can create relationship among class . so no need to write the same 
code again and again. there are two option to create the relaionship among the classes , so we access the top
level class property to the lower level classes

create a object of top level classes to lower level classes with the help of this lower classes we can access
the upper 
this is know as containership 

CONTAINRSHIP :

when one class object of anoher class this is called containership

in the above situation  have o perform of all the situation with the help of multiple objects,it creates complexity
genrally we prefer ,to perform all the operation with the 


INHERITANCE:

ONE Class can acces the properties of anoter class without object this is called inheritance .


in below example there 4 classes 
this 4classes in another class  and the have to use different objects 

to reduce this complexity, we want single object should perorm all classes function.
now we have going to related this classes with each other"extend" and implement inheritance 
after this we will create a single object of class division   



TYPES OF INHERITANCE :

1.SINGLE     ->   parent,child
2.MULTILEVEL ->   grand parent ,parent ,grand child
3.MULTIPLE   ->   father, mother,child  NOT SUPPORTED
4.HIERARCHICAL -> father,child1,child2
5.HYBRID


*/

import java.util.*;

class addition {

int n1,n2,n3;
	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number :");
		n1=sc.nextInt();
		
		System.out.print("Enter second number :");
		n2=sc.nextInt();
	}
	void sum(){
		n3=n1+n2;
		
	}
	
	void display1(){
		System.out.print("addition is :"+n3);
	}
  
}

class substraction extends addition {
	
	
	void sbt(){
		n3=n1-n2;
		
	}
	
	void display2(){
		
		System.out.print("Substraction is :"+n3);
		
		
	}
	
}
	
 
class multiply extends substraction{
	
	
	
	
	void mlt(){
		
		n3=n1*n2;
		
		
	}
	
	void display3(){
		
		System.out.print("multiplication is :"+n3);
		
	
    }	
}

class division extends multiply{
	
	
	
	void dvd(){
		
		n3=n1/n2;
		
	}
	
	void display4(){
			System.out.print("quotient is :"+n3);
	
    }
	
}	


class main{
	
	public static void main (String s[]){
		
		division d1=new division();
		
		d1.input();
		d1.sum();
		d1.display1();
		
		
		d1.sbt();
		d1.display2();
		
		
		d1.mlt();
		d1.display3();
		
		
		d1.dvd();
		d1.display4();
		
	}
}

