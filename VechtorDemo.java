package InputOutput;

import java.util.*;

public class VechtorDemo {
	public static void main(String[]args) {
	Vector<String> v=new Vector<String>();
	
	v.add("Mesh");
	v.addElement("Hitesh");
	v.addElement("Machisoton");
	
	
	
	Iterator<String> itr=v.iterator();
	while(itr.hasNext()) {
		System.out.println("Print"+itr.next());
	}
}
}
