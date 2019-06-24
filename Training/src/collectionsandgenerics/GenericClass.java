package collectionsandgenerics;

public class GenericClass<D>//D is the type
{
          D d;
          public GenericClass(D d)
          {
        	  this.d=d;
          }
          public D printVal()
          {
        	  return this.d;
          }
          public static void main(String args[])
          {
        	  GenericClass<Integer> gen=new GenericClass<Integer>(90);
        	  System.out.println("The value of the integer object is:"+gen.printVal());
        	  GenericClass<Float> gen1=new GenericClass<Float>(2.0f);
        	  System.out.println("The value of the Float object is:"+gen1.printVal());
        	  GenericClass<String> gen2=new GenericClass<String>("Nandu");
        	  System.out.println("The value of the String object is:"+gen2.printVal());
        	  
        	  
          }
}
