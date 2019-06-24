package  collectionsandgenerics;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapProg {
 public static void main(String []args) {
	 Integer i=new Integer(1);
	 Integer a=new Integer(1);
	 HashMap<Integer, String> hm = new HashMap<>();
	 
	 hm.put(i, "Krishna");
	 hm.put(a, "Kumar");
	 
	 System.out.println(hm);
	 
	 IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
	 ihm.put(i, "Krishna");
	 ihm.put(a, "Kumar");
	 System.out.println(ihm);
	 

}
}