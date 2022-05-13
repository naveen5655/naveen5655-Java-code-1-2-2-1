package naveen;
import java.util.Scanner;
import java.util.*;
public class EmployeeDemo {
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 Map<String,Employee> s = new HashMap();
		 s.put("144-25-5464", new Employee("harry"));
		 s.put("567-24-2546", new Employee("Tom"));
		 s.put("157-62-7935", new Employee("jerry"));
		 s.put("456-62-5527", new Employee("Mike"));
		 System.out.println("1.Prints all the entries\n2.Remove an entry\n3.replace an entry\n4.look up a values\n5.Iterate through entries\n6.exit");
		 switch(sc.nextInt())
		 {
		   case 1:
			   System.out.println(s);
			   break;
		   case 2:
			   s.remove("567-24-2546");
			   System.out.println("Removed successfully");
			   break;
		   case 3:
			  s.put("456-62-5527", new Employee("john"));
			  System.out.println("successfully replaced");
			   break;
		   case 4:
			   System.out.println(s.get("157-62-7935"));
			   break;
		   case 5:
			   for(Map.Entry<String, Employee>entry:s.entrySet())
			   {
				   System.out.println("key= "+entry.getKey()+",Value= "+entry.getValue()+"\n");
			   }
			   break;
		   case 6:
			   System.out.println("enter correct input");
			   break;
		 }
		
		 sc.close();
	 }
	

}
