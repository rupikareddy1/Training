package areas;

import java.io.DataInputStream;
import java.io.IOException;

public class ParallelogramPerimeter {
	public static int side_1,side_2,perimeter;
    
    public int perimeter()
    {
   	 perimeter=2*(side_1+side_2);
   	 return perimeter;
    }
    public static void main(String args[])throws IOException
    {
   	 DataInputStream b=new DataInputStream(System.in);
   	 System.out.println("Enter the side1");
        side_1=Integer.parseInt(b.readLine());
        System.out.println("Enter the side2");
        side_2=Integer.parseInt(b.readLine());
        ParallelogramPerimeter P=new ParallelogramPerimeter();
        P.perimeter();
   	 System.out.println("The perimeter is:"+perimeter);
    }

}
