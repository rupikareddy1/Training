package exceptions;
import java.util.Scanner;
public class Stringcompare {
	public static void main(String args[])
	{
String s[]=new String[30];
int n;
String s1;
boolean contain=false;
Scanner k=new Scanner(System.in);
System.out.println("Enter the no.of strings");
n=k.nextInt();
System.out.println("Enter the strings:");
for(int j=0;j<=n;j++)
{
s[j]=k.nextLine();
}
System.out.println("Enter the string");
s1=k.nextLine();
k.close();

		for(int j=0;j<=n;j++)
		{
		if(s[j].equals(s1))
		{
		  contain=true;
		  break;
		}
		}
		try
		{
			if(contain==true)
			{
				System.out.println("Enrolled");
			}
		
	else
	{
		throw new Exception("you are not enrolled to the class");
	}
	 }


	catch(Exception e)
	{
		System.out.println(e);
	}
   }
}
