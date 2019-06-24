package classes;
public class Icecream
{
private int noofingredients=3;
private String flavour="Raspberry";
private String state="creamy";
public void ingredientNo()
{
System.out.println("The no.of Ingredients are:"+noofingredients);
}
public void displayIngredients(String a,String b,String c)
{
System.out.println("The Ingredients are:"+a+b+c);
}
public void consistency(int cream)
{
if(cream>70)
{
System.out.println("Great consistency");
}
else
{
System.out.println("Poor consistency");
}
}
public void displayState()
{
System.out.println("The state of Icecream is:"+state);
}
public String getFlavour()
{
return flavour;
}
public static void main(String args[])
{
Icecream I=new Icecream();
I.ingredientNo();
I.displayIngredients("cream,","sugar,","essence");
I.consistency(30);
I.displayState();
System.out.println("The flavour of the Icecream is:"+I.getFlavour());
}
}