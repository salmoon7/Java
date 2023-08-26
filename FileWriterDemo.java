package InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String []args) throws IOException {
		FileWriterDemo e=new FileWriterDemo();
		
		File bikeInfoFile=new File("c:\\EDUREKAIO\\Bike.txt");
		e.writeToFile(bikeInfoFile);
		
		
	}
	
	
	public void writeToFile(File fileToWrite) throws IOException {
		FileWriter bikeInfoWriter=new FileWriter(fileToWrite);
		bikeInfoWriter.write("Bugati");
		bikeInfoWriter.close();
		bikeInfoWriter.flush();
	}
	
	
}
