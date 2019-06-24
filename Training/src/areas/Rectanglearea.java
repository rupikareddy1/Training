package areas;

import java.io.*;

public class Rectanglearea {
	public static void main(String args[])throws IOException
 	{
 		int length,breadth,area;
 	   DataInputStream a=new DataInputStream(System.in);
 	   System.out.println("Enter the length of Rectangle");
 	   length=Integer.parseInt(a.readLine());
 	  System.out.println("Enter the breadth of Rectangle");
	   breadth=Integer.parseInt(a.readLine());
      area=(length*breadth);
      System.out.println("The area of the Rectangle is:"+area);
 	}

}
