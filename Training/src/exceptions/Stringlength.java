package exceptions;
import java.util.Scanner;
public class Stringlength {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.nextLine();
	s.close();
	try
	{
		if(a.length()>15)
		{
			throw new Exception("please enter a shorter name");
		}
		else
		{
			System.out.println("The string is:"+a);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
