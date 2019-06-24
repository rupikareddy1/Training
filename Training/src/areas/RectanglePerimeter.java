package areas;

import java.io.DataInputStream;
import java.io.IOException;

public class RectanglePerimeter {
public static int length,width,perimeter;
    
    public int perimeter()
    {
   	 perimeter=(2*length)+(2*width);
   	 return perimeter;
    }
    public static void main(String args[])throws IOException
    {
   	 DataInputStream b=new DataInputStream(System.in);
   	 System.out.println("Enter the length");
        length=Integer.parseInt(b.readLine());
        System.out.println("Enter the width");
        width=Integer.parseInt(b.readLine());
        RectanglePerimeter R=new RectanglePerimeter();
        R.perimeter();
   	 System.out.println("The perimeter is:"+perimeter);
    }

}
