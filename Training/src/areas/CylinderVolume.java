package areas;

import java.util.Scanner;

public class CylinderVolume {
	static double volume;
	static float radius,height;
	 
    public void volume()
      {
       volume=Math.PI*radius*radius*height;
         System.out.println("The volume of cylinder is:"+volume);
      }
         public static void main(String args[])
         {
      	   CylinderVolume c=new CylinderVolume();
      	   Scanner s = new Scanner(System.in);
             System.out.println("Enter radius");
                 radius= s.nextFloat();
                 System.out.println("Enter height");
                   height= s.nextFloat();
                     s.close();
      	             c.volume();
         }
}
