package areas;

import java.util.Scanner;

public class CubeCurvedSurface { static int side;
 
  public void surfacearea() { surfacearea = 4 * side * side;
    System.out.println("The curvedsurafcearea of the cube is:" + surfacearea);
  }
  
  static int surfacearea;
  public static void main(String[] args) { Scanner s = new Scanner(System.in);
    System.out.println("Enter the side of cube");
    side = s.nextInt();
    s.close();
    CubeCurvedSurface C = new CubeCurvedSurface();
    C.surfacearea();
  }
}