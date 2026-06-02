import java.util.*;
class vect
{
	
	public static void main(String s[])
	{
		int i;
	Vector v=new Vector();
	System.out.print("\nSize of Vector Is : "+v.size());
	
	Vector v1=new Vector(5);
	System.out.print("\nSize of New Vector Is : "+v1.size());
	
	
	v.addElement(10);
	v.addElement("Ram");
	v.addElement(10000000);
	v.addElement(10.34);
	v.addElement(3.14f);
	v.addElement('A');
	
	System.out.print("\nNow Size of Vector Is : "+v.size());
	
	v.insertElementAt("raj",2);
	
	System.out.print("\nNow Size of Vector Is : "+v.size());
	
	Object t=v.elementAt(0);
	System.out.print("\nFirst Element Is : "+t);
	
	System.out.print("\nFirst Element Is : "+v.elementAt(0));
	
	System.out.print("\nSecond Element Is : "+v.elementAt(1));
	
	System.out.print("\n\tAll Elements of Vector are : ");
	for(i=0;i<v.size();i++)
		System.out.print("\n\t\t"+v.elementAt(i));
		
	
	v.removeElement(10);
	
	System.out.print("\n\tAll Elements of Vector after deletion of 10 are : ");
	for(i=0;i<v.size();i++)
		System.out.print("\n\t\t"+v.elementAt(i));
	
	v.removeElementAt(3);
	
	System.out.print("\n\tAll Elements of Vector after deletion of 3 Element are : ");
	for(i=0;i<v.size();i++)
		System.out.print("\n\t\t"+v.elementAt(i));
	
	
	v.removeAllElements();
	
	System.out.print("\nFinal Last Size of Vector Is : "+v.size());
		
	
	
	}
}