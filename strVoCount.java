import java.util.*;

class strVoCount{

String s,temp;
int count=0;

void input(){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	//s=sc.nextLine();
	temp=sc.nextLine();
	s=temp.toLowerCase();

	
}

void process(){

	for(int i=0;i<s.length(); i++){
	
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
		
			count+=1;
		}
	
	
	}

}

void output(){

	System.out.println(count);

}

  public static void main(String args[]){

	strVoCount s=new strVoCount();
	
	s.input();
	s.process();
	s.output();
}

}