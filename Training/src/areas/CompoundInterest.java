package areas;


public class CompoundInterest {
  public static void main(String[] args) { float time = 3.0F;float rateofinterest = 5.0F;float principle = 5000.0F;float n = 1500.0F;float p = 1.0F;
    float x = n * time;
    for (int i = 1; i <= x; i++)
    {
      p *= (1.0F + rateofinterest / 100.0F / n);
    }
    float compound = principle * p;
    System.out.println("The compound interest is:" + compound);
  }
}