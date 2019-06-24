package classes;
public class Village
{
private String name;
private float area;
private int population;
public void displayName()
{
System.out.println("The naame of the village is:"+name);
}
public void displayArea()
{
System.out.println("The Area of the village is:"+area);
}
public int population( )
{
return population;
}
public static void main(String args[])
{
Village V=new Village();
V.name="Routha";
V.area=2456.34f;
V.population=1000;
V.displayArea();
V.displayName();
System.out.println("The no.of people in the village are:"+V.population());
}
}