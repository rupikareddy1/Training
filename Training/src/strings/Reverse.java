package strings;
import java.util.Scanner;
public class Reverse {
	public static void main(String args[])
	{
	    String str,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		s.close();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);//+ is used for concatenation
		}
		System.out.println("The reversed string is:"+rev);
		
	}

}
