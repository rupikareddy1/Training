package exceptions;
import java.util.Scanner;
public class sum {
	public static void main(String args[])
	{
		int a,b,c,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s.nextInt();
	
	System.out.println("Enter the value of b");
	b=s.nextInt();
	
	System.out.println("Enter the value of c");
	c=s.nextInt();
	s.close();
	try
	{
		sum=a+b+c;
		if(sum>=100)
		{
			throw new Exception("Please enter the numbers whose total is below 100");
		}
		else
		{
			System.out.println("The sum is:"+sum);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
