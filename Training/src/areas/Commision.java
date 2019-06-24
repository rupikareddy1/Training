package areas;

public class Commision {
  int sales = 300;
  float commisionrate = 5.0F;
  
  public void commision() {
    commision = (sales * commisionrate / 100.0F);
    System.out.println("The commision is:" + commision);
  }
  
  float commision;
  public static void main() {
	  Commision c = new Commision();
    c.commision();
  }
}