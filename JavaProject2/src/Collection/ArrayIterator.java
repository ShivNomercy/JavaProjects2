package Collection;
import java.util.*;
public class ArrayIterator {
	  public static void main(String[] args) {
		 
    ArrayList<String> ao = new ArrayList<String>();
                      ao.add("Dehli");
                      ao.add("Mumbai");
                      ao.add("Hyderabad");
                      ao.add("Pune");
                      ao.add("Hingoli");
                      System.out.println(ao);
                      System.out.println("==============");
                      Iterator itr =ao.iterator();
                      while(itr.hasNext()) // read data
                      {
                    	  System.out.println(itr.next());// printdata
                      }
                      
		      
	}

}
