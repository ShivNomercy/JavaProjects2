package Collection;
import java.util.*;
public class ArrayList2 {
	  public static void main(String[] args) {
		ArrayList <String> ao= new ArrayList<String>();
		       System.out.println(ao.size());
		            ao.add("Bhogoan");
		            ao.add("Basmat");
		            ao.add("Hingoli");
		            ao.add("Jai Maharashtra");
		            ao.add("India");
		            ao.add("Bhogoan");
		            ao.add(null);
		            ao.add("world");
		            ao.add("Hyderabad");
		            System.out.println(ao.hashCode());
		            System.out.println(ao.contains("Hingoli"));
		            System.out.println(ao.remove(0));
		            ao.remove("Hingoli");
		            ao.remove(0);
		            ao.add(0, "Parbhani");
		            System.out.println(ao);
		     // Inhance for loop / for each loop
		            for(String s:ao)
		            {
		            	System.out.println(s);
		            }
	}

}
