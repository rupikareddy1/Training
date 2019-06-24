package strings;
import java.util.*;
public class ReverseNumber {
	public static void main(String args[])
	{
	int n,r,temp=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
	s.close();
	while(n>0)
	{
	r=n%10;
	temp=(temp*10)+r;
	n=n/10;
	}
	System.out.println("The reversed number is:"+temp);
	}
}
