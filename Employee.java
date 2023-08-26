package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Employee {
public static void main(String []args) throws FileNotFoundException {
	File employeeInfoFile=new File("C:\\EDUREKAIO\\Employee.txt");
	Employee e =new Employee();
	e.writeToFile(employeeInfoFile);
    File VehicleInfo =new File("C:\\EDUREKAIO\\VehicleInfo.txt");
    e.readFile(VehicleInfo);
}



public void writeToFile(File fileToWrite) {
	 PrintWriter employeeInfoWriter=null;
	try {
	employeeInfoWriter=new PrintWriter(fileToWrite);
	employeeInfoWriter.println("SpiderMan");
	employeeInfoWriter.println("Batman");
	}catch(FileNotFoundException e){
		System.out.println("The file is not found in"+fileToWrite.getName());
		throw new RuntimeException(e);
	}
	finally {
		employeeInfoWriter.close();
	}
}


public void readFile(File fileToRead) throws FileNotFoundException {
	try (Scanner input = new Scanner(fileToRead)) {
		while(input.hasNext()) {
		
		System.out.println("Line read from the input file"+input.nextLine());
		}
	}
	
}
}
