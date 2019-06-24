package classes;
public class Terranium
{
private float height;
private float heightofplants=3.2f;
private float weightofsand=15.2f;
private int levelofsand=2;
private String sandcolor="Blue";
public void Height()
{
height=heightofplants+(float)levelofsand;
System.out.println("The height of the terranium is:"+height);
}
public void displayWeight(float weightofplants,float weightofglass)
{
System.out.println("The weight of the Terranium is:"+(weightofsand+weightofplants+weightofglass));
}
public void color()
{
System.out.println("The colour of the sand in the Terranium is:"+sandcolor);
}
public static void main(String args[])
{
Terranium T=new Terranium();
T.Height();
T.displayWeight(1.2f,10.8f);
T.color();
}
}