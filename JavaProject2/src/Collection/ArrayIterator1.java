package Collection;
import java.util.*;
public class ArrayIterator1 {
	public static void main(String[] args) {
		ArrayList<String> ao = new ArrayList<String>();
		                  ao.add("Java");
		                  ao.add("Paythan");
		                  ao.add("MSCIT");
		                  ao.add("Html");
		                  ao.add("CSS");
		                  ao.add("Array");
		                  ao.add("ArrayList");
		                  System.out.println(ao);
		                  
		            Iterator itr =ao.iterator();
		            while(itr.hasNext()) // read value 
		         {
		         System.out.println(itr.next()); // print value
		         }
				
	}

}
