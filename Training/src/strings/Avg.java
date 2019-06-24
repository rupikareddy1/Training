package strings;
import java.util.*;
public class Avg {
	public static void main(String args[])
	{
int arr[]= new int[10],avg=0,sum=0,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of elements");
n=s.nextInt();
System.out.println("Enter the no.of elements");
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
s.close();
for(int i=0;i<n;i++)
{
	sum=sum+arr[i];
	}
avg=sum/n;
System.out.println("The average is:"+avg);

	}
}
