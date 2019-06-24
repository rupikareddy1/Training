package strings;
import java.io.*;
public class ReverseArray {
	public static void main(String args[])throws IOException
	{
int arr[]=new int[10],n,temp=0;
DataInputStream p=new DataInputStream(System.in);
System.out.println("Enter no.of elements in the array:");
n=Integer.parseInt(p.readLine());
System.out.println("Enter no.of elements in the array:");
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(p.readLine());
}
System.out.println("The array is:");
for(int i1=0;i1<n;i1++)
{
	System.out.println("The array is:"+arr[i1]);
}
System.out.println("The reversed array is:");
for(int j=n-1;j>=0;j--)
{
	temp=arr[j];
	System.out.println(temp);
}
}
}
