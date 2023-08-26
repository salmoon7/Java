package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {
	public static void main(String []args) throws IOException {
		FileInputDemo inputDemo=new FileInputDemo();
		inputDemo.readFile("c:\\EDUREKAIO\\message.txt");
		
	}
	
	private void readFile(String fileRead) throws IOException {
		FileInputStream inputStream=new FileInputStream(fileRead);
		int IntegerReadFromFile;
		while((IntegerReadFromFile=inputStream.read())!=-1) {
			System.out.println("The sentence read from the file is, "+(char)IntegerReadFromFile);
		}
	}
}
