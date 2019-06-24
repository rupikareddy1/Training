package  collectionsandgenerics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
public static void main(String args[])
{
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(1,"Rupika");
	h.put(2,"POP");
	h.put(3,"krish");
	h.put(4,"Anusha");
	System.out.println("The entries are:");
	Set<Entry<Integer,String>> s=h.entrySet();
	for(Entry<Integer,String> e:s)
	{
		Integer key=e.getKey();
		String val=e.getValue();
		System.out.println(key+"    "+val);
	}
	System.out.println("The keys are:");
	Set<Integer> keys=h.keySet();
	for(Integer i:keys)
	System.out.println(i);
		
		
	}
	
}
