package areas;

import java.util.Scanner;

public class CheckPrime {
  
  public static void main(String[] args) { int flag = 0;int i = 1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = s.nextInt();
    s.close();
    while (i <= n)
    {
      if (n % i == 0) {
        flag++;
      }
      i++;
    }
    if (flag == 2)
    {
      System.out.println(n + "is prime");
    }
  }
}