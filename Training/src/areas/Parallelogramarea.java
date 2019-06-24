package areas;

import java.io.*;

public class Parallelogramarea
{
	 public static void main(String args[])throws IOException
	   {

		 int height,breadth,area;
		   DataInputStream a=new DataInputStream(System.in);
		   System.out.println("Enter the breadth of parllelogram");
		   breadth=Integer.parseInt(a.readLine());
		  System.out.println("Enter the height of parallelogram");
	       height=Integer.parseInt(a.readLine());
             area=(breadth*height);
           System.out.println("The area of the Rectangle is:"+area);
}
}