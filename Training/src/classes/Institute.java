package classes;
public class Institute
{
private int noofstudents=30;
private  int nooftopics=5;
boolean fake;
private  String name="Jason's Institute";
public void classes()
{
System.out.println("The no.of classes per day are:");
if(noofstudents<15)
{
System.out.println("1");
}
else
{
System.out.println("2");
}
}
public void displayName()
{
System.out.println("The Name of the Institute is:"+name);
}
public void students()
{
System.out.println("The no.of students are:"+noofstudents);
}
public void topics()
{
System.out.println("The No.of Topics are:"+nooftopics);
}
public void isfake()
{
if(fake=true)
System.out.println("The Institute is fake");
else
System.out.println("The Institute is genuine");
}
public static void main(String args[])
{
Institute I=new Institute();
I.fake=false;
I.displayName();
I.students();
I.classes();
I.topics();
I.isfake();
}
}