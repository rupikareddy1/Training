package areas;


public class Fibonacci {
  public static void main(String[] args) { 
	  int n = 10;int a = 0;int b = 1;int sum = 0;
    if (n == 0)
    {
      return;
    }
    for (int i = 1; i <= n; i++)
    {
      System.out.println(a);
      sum = a + b;
      a = b;
      b = sum;
    }
  }
}