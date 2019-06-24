package areas;

public class Perfect {
  public static void main(String[] args) { int n = 6;int sum = 0;
    for (int i = 1; i < n; i++)
    {
      if (n % i == 0)
      {
        int r = i;
        sum += r;
      }
    }
    
    if (sum == n)
    {
      System.out.println(sum + "is perfect");

    }
    else
    {
      System.out.println(sum + "is not perfect");
    }
  }
}