package areas;

import java.util.Scanner;

public class Power { public static int number; public static int raisingno;
  public Power() {}
  public static int power = 1;
  
  public void power() {
    if ((number >= 0) && (raisingno == 0))
    {
      power = 1;
      System.out.println("The power is " + power);
    }
    else if ((number == 0) && (raisingno == 0))
    {
      power = 0;
      System.out.println("The power is " + power);
    }
    else
    {
      for (int i = 1; i <= raisingno; i++)
      {
        power *= number;
      }
      
      System.out.println("The power is:" + power);
    }
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number:");
    number = s.nextInt();
    System.out.println("Enter the power which the number is raised to:");
    raisingno = s.nextInt();
    s.close();
    Power p = new Power();
    p.power();
  }
}