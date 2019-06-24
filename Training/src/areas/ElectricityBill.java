package areas;

import java.util.Scanner;

public class ElectricityBill {
  
  public static void main(String[] args) { 
	int limit_per_month = 100;int fine_amount = 20;int powersupply = 150;
    float unitcost = 2.3F;float bill = 1.0F;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no.of Appliances:");
    int applianceno = s.nextInt();
    s.close();
    int usage = applianceno / 150;
    if (usage <= 100)
    {
      for (int i = 1; i < applianceno; i++)
      {
        bill = i * unitcost;
      }
      System.out.println("The bill without fine is:" + bill);
    }
    else
    {
      System.out.println("The bill with fine is:" + (bill + 20.0F));
    }
  }
}