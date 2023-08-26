package InputOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[]args){
		List newArrayList=new ArrayListDemo().createArrayList();
		new ArrayListDemo().printArrayListDemo(newArrayList);
	}
	private List createArrayList(){
		List<String> car=new ArrayList<>();
		car.add("BMW");
		car.add("Mercedes");
		car.add("Bugati");
		car.add("Camry");
		
		return car;
		
	}
	private void printArrayListDemo(List list){
		Iterator listiterator=list.iterator();
		while(listiterator.hasNext()) {
			System.out.println("The cars in the Array List are,"+listiterator.next());
		}
		
		
	}

}
