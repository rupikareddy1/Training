
package exceptions;
import java.util.*;
public class ArrayOut {
	public static void main(String args[])
	{
	int a[]=new int[4];
	int n=3;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the values in array:");
	for(int i=0;i<=n;i++)
	{
		a[i]=s.nextInt();
		
	}
	s.close();
	try
	{
		a[5]=6;
		System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}

}
}
