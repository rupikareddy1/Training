package areas;

public class Factorial { int fact = 1;
  
 
  public void factorial(int n) { if (n == 0)
    {
      return;
    }
    System.out.println("The factorial of" + n + "is:");
    for (int i = n; i >= 1; i--)
    {
      fact *= i;
    }
    System.out.println(fact);
  }
  
  public static void main(String[] args) {
    Factorial f = new Factorial();
    f.factorial(5);
  }
}