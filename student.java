import java.util.*;
class student{
	double m1,m2,m3,total,per;
	int roll;
	void input(){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter roll no. : ");
		roll=sc.nextInt();
		
		System.out.println("Enter your first subject marks :");
		m1=sc.nextInt();
		
		System.out.println("Enter your second subject marks :");
		m2=sc.nextInt();
		
		System.out.println("Enter your third subject marks :");
		m3=sc.nextInt();
			
	
	}
	void sum(){
		
	total=m1+m2+m3;
	
	per=(total/300)*100;
	}
	void display(){
		
		System.out.println("total marks is:" +total);
		System.out.println("percentage  is:" +per);
		
	}
	
	public static void main(String args[]){
	student s=new student();
	
	s.input();
	s.sum();
	s.display();
}
	
}