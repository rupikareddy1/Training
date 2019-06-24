package polymorphism;

class Animal
{
int legs;
long noofspecies=1204756;
boolean livingbeing=true;
String name,category,typeofeater;
void display()
{
System.out.println("Im an Animal");
System.out.println("Is Animal  a livingbeing?"+livingbeing);
System.out.println("No.of Animalspeccies are:"+noofspecies);
}
}

class Buffalo extends Animal
{
	String color="Black";
	Buffalo()
	{
name="Buffalo";
legs=4;
category="secondary";
typeofeater="Herbivore";
	}
void display()
{
super.display();
System.out.println("Iam "+name);
System.out.println("I have "+legs+"legs");
System.out.println("I belong to the category  "+category);
System.out.println("Im "+ color +" in color");
System.out.println("Im a "+typeofeater);
}
}
public class TestAnimal 
{
public static void main(String args[])
{
Buffalo B=new Buffalo();
B.display();
}
}
