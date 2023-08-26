package InputOutput;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
	public static void main(String []args) {
		Collection <String> collection=new ArrayList<>();
		collection.add("Lagos");
		collection.add("Ibadan");
		collection.add("Ijebu");
		collection.add("Zaria");
		
		for(String element:collection) {
		System.out.println(element);	
		}
	}
}
