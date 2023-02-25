package sample2;

import java.util.ArrayList;

public class ArrayListActivity {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Arun");
		names.add("Karthik");
		names.add("Anand");
		
		System.out.println(names);
		
		names.set(2, "Ram");
		
		System.out.println(names);
		
		names.remove(1);
		
		System.out.println(names);

	}

}
