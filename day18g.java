package Test3;
import java.util.HashMap;


public class day18g {

	public static void main(String[] args) {
   HashMap<String ,Integer> students = new HashMap<>();
		
		students.put("rasmila", 30);
		students.put("kamal", 40);
		students.put("sakshyam",7);
		students.put("jay", 4);
		students.put("ramesh", 10);
		System.out.println(students);
		
		// Accessing the value from HashMap()
		int a = students.get("rasmila");
		System.out.println(a);
		
		// check particular key exists
		boolean b = students.containsKey("kamala");
		System.out.println(b);
		
		// total number of key value in HashMap
		int c = students.size();
		System.out.println(c);
		
		// remove the value
		students.remove("rasmila");
		System.out.println(students);
		
		// update the value
		
		students.put("jay", 8);
		System.out.println(students);
		
		// looping through HashMap
		
		System.out.println(students.values());
		System.out.println(students.keySet());
		
		// loop over it using above method
		
		for(String key : students.keySet()) {
			System.out.println(key);
		}
		
		for(int value : students.values()) {
			System.out.println(value);
		}
		
		
	}



	}


