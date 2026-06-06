/*Write a program to create a class name first 
contain methods
Show and display method.
show must be define, display must be declared only.

create another class name second also contain two methods 
name -> output and view.
output must define and view must view declared.

create 3rd class third which inherit with both class 
it must contain a method name mymethod,
it is inheriting both class that's why it will define abstract method of both class.
now define object of third class and call all method in main.*/

//jis class ke saare method abstract ho usse interface kehte hai.
//isliye isko interface se karenge . abstract se nhii .

//java m multiple inheritance nhii hota .
//or interface ko bulayenge toh implement use

// *** interface batata hai humhe kya karna hai yeh batata hai .

/* 
1."INTERFACE" keyword is used t create it.
2.its all method are by default abstract.
3."IMPLEMENTS" keyword is used to call this interface in class . 
4.in this class it is compulsary to define all the method of interface .
5."PUBLIC" keyord is has to be used with the interface method in class.
6. all the variable of interface are by default"FINAL".
7. all the variable of interface are by default"STATIC".



*/ 

/*interface first
{
	abstract void show();	
	abstract void display();
}



interface second
{	
	abstract void output();
	abstract void view();
}



class third implements first,second
{
	void mymethod()
	{
	System.out.print("I am in the My method of third class. \n");
	}
	
	public void display()
	{
		System.out.print("I am in display of first class. \n");
	}
	
	public void view()
	{
		System.out.print("I am in view of second class. \n");
	}
	
	public void show()
	{
	System.out.print("I am in show of first class. \n");
	}
	
	
	public void output()
	{
	System.out.print("I am in output of second class. \n");
	}
	
	
	public static void main(String args[])
	{
		third t=new third();
		
		t.view();
		t.show();
		t.display();
		t.output();
		t.mymethod();
		
	}

}*/


class third {

	public static void main (String wtf){
	
	Sytem.out.print("")
	}
}



