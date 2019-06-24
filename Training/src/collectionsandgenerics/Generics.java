package  collectionsandgenerics;
import java.util.ArrayList;

public class Generics {
public static void main(String args[])
{
	ArrayList a=new ArrayList();
	a.add(20);
	a.add(90);
	a.add(4.5f);
	a.add("Rup");
	for(Object obj:a)
	{
		System.out.println("Direct:"+obj);
		if(obj instanceof String)
		{
			String s=(String)obj;
			System.out.println(s);
		}
		else if(obj instanceof Integer)
		{
			Integer I=(Integer)obj;
			System.out.println(I);
			
		}
		
		else if(obj instanceof Float)
		{
			Float f=(Float)obj;
			System.out.println(f);
	}
	}
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("papa");
	a1.add("Rupa");
	a1.add("Krish");
	for(String s:a1)
	System.out.println(s);
	
	
}
}
