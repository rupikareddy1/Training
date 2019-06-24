package exceptions;

import java.util.Scanner;

public class ArithArray {
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
		int temp=a/b;
		System.out.println(temp);
	
	}
	catch(ArithmeticException e1)
	{
		System.out.println(e1);
	}
	try
	{
		p[7]=9;
		System.out.println(p[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
  
}
}
