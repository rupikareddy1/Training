package classes;
public class Heart
{
private int arteries=2,valves=5;
private String colour="brown";
public void displayColour()
{
System.out.println("The colour of heart is:"+colour);
}
public void arteryCount()
{
System.out.println("The no.of Arteries are:"+arteries);
}
public int pumpRate(int size)
{
int pumpingRate=size*valves;
return pumpingRate;
}
public static void main(String args[])
{
Heart H=new Heart();
H.displayColour();
H.arteryCount();
System.out.println("The pumping rate is:"+H.pumpRate(2));
}
}