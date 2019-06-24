package areas;

public class Discount { 
	  
	  int discount_rate;
	  int discount;
	  int sp;
  
  public void cal_dis() {
	  sp = (100 - discount_rate);
    discount = (sp * price / 100);
    System.out.println("The discount for the products is:" + discount); }
  
  int price;
  
  public static void main(String[] args) { 
 Discount D = new Discount();
    D.price = 23;
    D.discount_rate = 10;
    D.cal_dis();
  }
}