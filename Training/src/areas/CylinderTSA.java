package areas;

import java.util.Scanner;

public class CylinderTSA {
  
	static int totalsurfacearea;
	  static int height;
  public void surfaceareatotal()
  { 
	  totalsurfacearea = (int)(6.283185307179586D * radius * radius + 6.283185307179586D * radius * height);
    System.out.println("The totalsurafcearea of the cylinder is:" + totalsurfacearea); }
  
  static int radius;
  
  public static void main(String[] args) { Scanner s = new Scanner(System.in);
    System.out.println("Enter the radius of cylinder");
    radius = s.nextInt();
    System.out.println("Enter the height of cylinder");
    height = s.nextInt();
    s.close();
    CylinderTSA C = new CylinderTSA();
    C.surfaceareatotal();
  }
}