package classes;
public class Car
{
private float mileage, distance=2232.4f;
private int speed;
private String typeoffuel="diesel";
private String color="Black";
public void displayColor()
{
System.out.println("The colour of the Car is:"+color);
}
public void displayFuelType()
{
System.out.println("Tyoe of the fuel is:"+typeoffuel);
}
public void speed()
{
speed=(int)distance/100;
System.out.println("The speed of the car is:"+speed);
}
public float mileage(float fuel_quantity)
{
mileage=fuel_quantity/distance;
return mileage;
}
public static void main(String args[])
{
Car C=new Car();
C.displayColor();
C.displayFuelType();
C.speed();
System.out.println("The mileage of the car is:"+C.mileage(234.56f));
}
}