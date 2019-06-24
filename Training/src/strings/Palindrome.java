package strings;
import java.util.*;
public class Palindrome {
public static void main(String args[]) {
	int n,rev=0,r;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
	s.close();
	int temp=n;
	while(n>0)
	{
		r=n%10;
		rev=(rev*10)+r;
		n=n/10;
	}
	if(temp==rev)
	{
	System.out.println("The given number is palindrome");
}
	else
	{
		System.out.println("The number is not palindrome");
	}
}
}