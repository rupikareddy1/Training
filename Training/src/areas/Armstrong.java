
package areas;


public class Armstrong { 
  public static void main(String[] args) { 
	  int n = 320;int temp = n;int t1 = 1;
    for (int i = n; i > 0; i++)
    {
      int r = n % 10;
      t1 += r * r * r;
      n /= 10;
    }
    n = temp;
    if (t1 == n)
    {
      System.out.println("Armstrong number");
    }
    else
    {
      System.out.println("Not Armstrong number");
    }
  }
}