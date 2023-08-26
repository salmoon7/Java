package InputOutput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[]args) {
		HashMapDemo demo=new HashMapDemo();
		demo.printHashMap(demo.createHashMap());
	}
	
	private Map<Integer,String> createHashMap(){
		Map<Integer,String> employeeHashMap =new LinkedHashMap();
		employeeHashMap.put(1,"Andrew");
		employeeHashMap.put(2, "Smith");
		employeeHashMap.put(3,"Andalad");
		
		return  employeeHashMap;
	}
	
	
	private void printHashMap(Map<Integer,String>  mapToPrint ) {
		Set keys=mapToPrint.keySet();
		System.out.println(mapToPrint);
		
	}
}
