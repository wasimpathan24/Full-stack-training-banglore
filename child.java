/*
Incase of ingeritance base class default constructor calls first.
sumtimes it may required to call the parameterized constructor of parent class.(To pass the vales.)
To change this default nature of calling constructor in inheritance.
we can use "super" keyword in child constructor ton call any kind of parameterized constructor of parent class,
we have to pass the required arrguments with the "super" keyword to call required parameterized constructor.
During development it may require to pass the value to the parent
 for some kind of operation performed by the parent but we can access only child then we will use "super" keyword to pass
 the value to the parent and now the parent will perform the corrosponding operation on this values.

*/

import java.util.*;
class gparent
{

	gparent()
	{
	System.out.println("This is default constructor of gparent class.\n");
	}
	gparent(int x,int y)
	{
	System.out.println("This is int int parameterized constructor of gparent\n");
	}
}
	
class parent extends gparent
{
	parent()
	{
	System.out.println("This is default constructor of parent class.\n");
	}
	parent(int x){
		
		System.out.println("This is int parameterized constructor of parent.\n");
		super(100, 200);
	}
	
}
class child extends parent
{
	child()
	{
		System.out.println("This is default constructor of child class. \n");
	}
	child(int x, int y, int z)
	{
		super(100);
		System.out.println("This is int int int parameterized constructor of child class. \n");
		
	}
		
		public static void main(String args[])
		
		{
		
		child2 ch=new child(10, 20, 30);
		
		}
		
}