package  strings;
import java.util.*;
public class Insertelement {
	public static void main(String args[])
	{
		int arr[]=new int[9],n,position,x;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements in the array:");
        n=s.nextInt();		
        System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++)
		{
		 arr[i]=s.nextInt();
		}
		
		System.out.println("The elements int the array are:");
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Enter the position where you want to insert:");
        position=s.nextInt();		
        System.out.println("Enter the number you want to insert:");
        x=s.nextInt();	
        s.close();
		for(int k=n-1;k>=position-1;k--)
		{
			arr[k+1]=arr[k];
		}
		arr[position-1]=x;
		System.out.println("The array is:");
		for(int h=0;h<=n;h++)
		{
			System.out.println(arr[h]);
		}
	}

}
