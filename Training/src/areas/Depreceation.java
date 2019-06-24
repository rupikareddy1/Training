package areas;
public class Depreceation { 
	static long depriciation; static long resvalue = 40000L; static long life = 5L; static long amount = 90000L;
  public static void main(String[] args) {
	  depriciation = (amount - resvalue) / life;
    System.out.println("The depreciation for " + life + "years is:" + depriciation);
  }
}