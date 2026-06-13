import java.util.Random;

class RandomNumber
{
	public static void main (String args [])
	{
		Random r=new Random();
		int num=r.nextInt(100)+1;
		
		System.out.print("Rndom Number : " +num);
		
	
	}
}