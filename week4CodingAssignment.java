
import java.util.*;
public class week4CodingAssignment {

	public static void main(String[] args) {
	
		//1 ArrayList for the employees
				
		List<String> employeeNames = new ArrayList<String>();
					
		//2 HashSet for the Id's 
		
		Set<Integer> ids = new HashSet<Integer>();
		
		//3 HashMap for the keys and values
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//Step 4 and 5
		
		employeeNames.add("Jack Johnson");
		
		employeeNames.add("Fernando Gulen");
	
		employeeNames.add("Mary Guillegos");
	
		employeeNames.add("Ozzy Osbourne");
		
		employeeNames.add("Ediie Van Halen");
			
		
			ids.add(123);
			
			ids.add(963);
			
			ids.add(789);
			
			ids.add(741);
			
			ids.add(456);
			
		//step 5	
			int i = 0;
		
			for (Integer id : ids) {
				
				employeeMap.put(id, "Jack Johnson ");
				i++;
			}
		
		//step 7
			
			StringBuilder idsBuilder = new StringBuilder ("-");
		
		//step 8
			
			idsBuilder.append(ids);
			
			
		//step 10 and 11
			
			StringBuilder namesBuilder = new StringBuilder (" ");
		
			namesBuilder.append(employeeNames);
			
			
		//Step 6
			
			for (Integer key : employeeMap.keySet()) {
				
				employeeMap.put(123, "Jack Johnson ");
				
				employeeMap.put(963, "Fernando Gulen ");
				
				employeeMap.put(789, "Mary Guillegos ");
				
				employeeMap.put(741, "Ozzy Osbourne ");
				
				employeeMap.put(456, "Eddie Van Halen ");

			}	
			
			
			
			System.out.println(idsBuilder.toString());
			System.out.println(namesBuilder.toString());
			
	}

}
