package InputOutput;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	
	public static void main(String[] args) {
		ArrayList<String> collection1=new ArrayList<>();
		collection1.add("Dallas");
		collection1.add("New yorks");
		collection1.add("Atlantica");
		collection1.add("Texas");
		
		System.out.println("A lost of citites in collection1: ");
		System.out.println(collection1);
		System.out.println("Is Dallas in the list ?"+collection1.contains("Dallas"));
		collection1.remove("Dallas");
		System.out.println(collection1.size()+"are now in the list");
		
		Collection <String> collection2=new ArrayList();
		collection2.add("Atlanta");
		collection2.add("Seattle");
		collection2.add("Los Angeles");
		collection2.add("PortLand");
		
		System.out.println("The list of cities in collection2: ");
		System.out.println(collection2);
		
	   ArrayList<String> c=(ArrayList<String>)(collection1.clone());
	   c.addAll(collection2);
	   System.out.println("The cities in collectiton1 and also in collection2 are:  ");
	   System.out.println(c);
	   
	   c=(ArrayList<String>)(collection1.clone());
	   c.retainAll(c);
	   System.out.println(c);
	   
	   c=(ArrayList<String>)(collection1.clone());
	   c.removeAll(collection2);
	   System.out.println("The list of citites in collection awithout thse in collecrio"+c);
	   
	   
	}
	
	
	
}
