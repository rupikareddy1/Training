package classes;
public class Debitcard
{
private String name;
private  long cardno;
private  int expiryyear;
private int CVV;
public void validation(int currentyear)
{
if(expiryyear>currentyear)
System.out.println("card expired");
}
public void displayDetails()
{
System.out.println("The details are:");
System.out.println("The name is:"+name);
System.out.println("The card number is:"+cardno);
System.out.println("The expiryyear is:"+expiryyear);
System.out.println("The CVV is:"+CVV);
}
public static void main(String args[])
{
Debitcard D=new Debitcard();
D.name="Krishna";
D.cardno=4529100476800892l;
D.expiryyear=2202;
D.CVV=990;
D.displayDetails();
D.validation(2019);
}
}