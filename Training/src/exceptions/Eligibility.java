package exceptions;
import java.util.Scanner;
public class Eligibility {
	public static void main(String args[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		age=s.nextInt();
		s.close();
		try
		{
			if(age>=18)
			{
				System.out.println("Eligible");
			}
			else
			{
				throw new Exception("accessdenied:You must be atleast 18 years old");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
