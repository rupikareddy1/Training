package areas;

public class Investment {
  public static void main(String[] args) { int PV = 1000;int interest = 2;int noofperiods = 5;int temp = 1;
    for (int i = 1; i <= noofperiods; i++)
    {
      temp *= (1 + interest / 100);
    }
    int FV = PV * temp;
    System.out.println("The value is" + FV);
  }
}