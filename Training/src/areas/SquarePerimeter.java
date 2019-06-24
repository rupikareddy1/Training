package areas;

import java.io.DataInputStream;
import java.io.IOException;

public class SquarePerimeter {
	public static int side,perimeter;
	  public int perimeter()
	    {
	   	 perimeter=4*side;
	   	 return perimeter;
	    }
	    public static void main(String args[])throws IOException
	    {
	   	 DataInputStream b=new DataInputStream(System.in);
	   	 System.out.println("Enter the side");
	        side=Integer.parseInt(b.readLine());
	        SquarePerimeter s=new SquarePerimeter();
	        s.perimeter();
	   	 System.out.println("The perimeter is:"+perimeter);
	    }
}
