package Collection;
import java.util.*;
public class ArrayObject {
	public static void main(String[] args) {
		
		ArrayList<Object> ao = new ArrayList<Object>();
		          ao.add("Inida");
		          ao.add('a');
		          ao.add(10);
		          ao.add(10.20);
		          ao.add(null);
		          ao.add("Inida");
		    System.out.println(ao);
		    for(Object x:ao)
		    {
		    	System.out.println(x);
		    }
		          
		
	}

}
