class studentCmdlineArgu
{
	public static void main(String s[])
	{
		String name=s[0],roll =s[1],n1=s[2],n2=s[3],n3=s[4];
		
		int m1=Integer.parseInt(n1);
		int m2=Integer.parseInt(n2);
		int m3=Integer.parseInt(n3);
		
		float total=m1+m2+m3;
		float per= (total/300)*100;
		
		System.out.println("Total Marks : "+total);
		System.out.println("Percentage  : "+per);
	}
	
	
}