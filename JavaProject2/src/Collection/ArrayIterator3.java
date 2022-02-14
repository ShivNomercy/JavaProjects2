package Collection;
import java.util.*;
public class ArrayIterator3 {
	public static void main(String[] args) {
		
		ArrayList ao = new ArrayList();
		          ao.add("Mumbai");
		          ao.add("Dehli");
		          ao.add("kolkata");
		          ao.add("Punjab");
		          ao.add("Hariyana");
		          ao.add("Lakhknaw");
		          ao.add("Jharkhand");
		          ao.add("Nagpur");
		          
		     ArrayList ao1 = new ArrayList();
		               ao1.add("India");
		               ao1.add("World");
		               
		      Iterator itr =ao.iterator();
		      while(itr.hasNext())
		      {
		    	  System.out.println(itr.next());
		      }
		      
		      Iterator ittr = ao1.iterator();
		      while(ittr.hasNext())
		      {
		    	  System.out.println(ittr.next());
		      }
		          
		               
		          
		
	}
	   

}
