package areas;

import java.util.Scanner;

public class ConeVolume {
	static double volume;
	static float radius,height;
	 
    public void volume()
      {
       volume=(Math.PI*radius*radius*height)/3;
         System.out.println("The volume of cone is:"+volume);
      }
         public static void main(String args[])
         {
      	   ConeVolume c=new ConeVolume();
      	   Scanner s = new Scanner(System.in);
             System.out.println("Enter radius");
                 radius= s.nextFloat();
                 System.out.println("Enter height");
                   height= s.nextFloat();
                     s.close();
      	             c.volume();
         }
}
