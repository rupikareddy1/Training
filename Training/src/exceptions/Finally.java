package exceptions;

import java.util.Scanner;

public class Finally {
	public static void main(String args[])
	{
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=s.nextInt();
	System.out.println("Enter the value of b");
	b=s.nextInt();
	s.close();
	try
	{
		int temp=a/b;
		System.out.println("The value is:"+temp);
	}
	catch(Exception e)
	{
		System.out.println(e+"Dividebyzero");
	}
finally
{
	System.out.println("Im final");
}
	}
}
