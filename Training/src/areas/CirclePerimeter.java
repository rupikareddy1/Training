package areas;

import java.io.DataInputStream;
import java.io.IOException;

public class CirclePerimeter {
	 public static double radius,perimeter;
     
     public double perimeter()
     {
    	 perimeter=2*Math.PI*radius;
    	 return perimeter;
     }
     public static void main(String args[])throws IOException
     {
    	 DataInputStream b=new DataInputStream(System.in);
    	 System.out.println("Enter the side");
         radius=Float.parseFloat(b.readLine());
         CirclePerimeter c=new CirclePerimeter();
         c.perimeter();
    	 System.out.println("The perimeter is:"+perimeter);
     }
}
