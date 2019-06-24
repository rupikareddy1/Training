package exceptions;

import java.util.Scanner;

public class ArithArrayCatchNest {
	public static void main(String args[])
	{
	int a,b;
	int p[]=new int[4];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=s.nextInt();
	System.out.println("Enter the value of b");
	b=s.nextInt();
	s.close();
	try
	{
		
		try
		{
		p[8]=6;
		System.out.println(p[8]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
		int temp=a/b;
		System.out.println("result:"+temp);
	}
	catch(ArithmeticException e1)
	{
		System.out.println(e1);
	}

}
}