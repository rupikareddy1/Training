package polymorphism;

abstract class Book
{
abstract void setTitle(String s);
}
class MyBook extends Book
{
void setTitle(String s)
{

System.out.println("The title is:"+s);
}
}
public class TestBook
{
public static void main(String args[])
{
MyBook B=new MyBook();
B.setTitle("Revolution2020");
}
}

