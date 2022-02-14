package Collection;
import java.util.*;
public class AddAll {
	  public static void main(String[] args) {
		ArrayList ao = new ArrayList();
		          ao.add(100);
		          ao.add(200);
		          ao.add(300);
		          ao.add(400);
		          ao.add(500);
		          ao.add(600);
		          ao.add(700);
		    ArrayList ao1 = new ArrayList();
		              ao1.add(1000);
		              ao1.add(2000);
		            ao.addAll(ao1);
		      
		    Iterator itr =ao.iterator(); 
		    while(itr.hasNext())
		    {
		    	System.out.println(itr.next());
		    }
		          
		          
		          
	}

}
