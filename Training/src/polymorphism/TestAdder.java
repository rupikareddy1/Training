package polymorphism;

class Arithmetic
{
int sum=0;
String f="Arithmetic";
int add(int a,int b)
{
sum=a+b;
return sum;
}
}
class Adder extends Arithmetic
{
String returnString()
{
return f;
}
}
public class TestAdder
{
public static void main(String[]args)
{
Adder a=new Adder();
System.out.println("Mysuperclass is:"+a.returnString());
System.out.println(a.add(23,76));
System.out.println(a.add(3,5));
System.out.println(a.add(6,7));
}
}
