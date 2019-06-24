package  collectionsandgenerics;

public class GenericFunc {
static <T> void display(T obj_t)
{
	System.out.println(obj_t);
}
static <D> void displayArray(D[] obj_arr)
{
	for(D d:obj_arr )
	{
	System.out.println(d);
	}
}
public static void main(String args[])
{
	display(2.333333f);
	display("dany");
	display(78);
	Integer a[]= {10,20,30,40};
	String s_arr[]= {"Rup","pap","pop"};
	displayArray(a);
	displayArray(s_arr);
	
}
}
