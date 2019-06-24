
package classes;
public class Perfume
{
private String brand="Jovan";
Perfume(String variant)
{
System.out.println("My flavour  is:"+variant);
}
Perfume()
{
System.out.println("Hi!Im perfume!");
}
public String brand()
{
return brand;
}
public static void main(String args[])
{
Perfume p=new Perfume();
System.out.println("Made by "+p.brand());
Perfume p1=new Perfume("WhiteMusk");
}
}