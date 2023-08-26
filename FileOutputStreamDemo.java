package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String []args) throws IOException {
		FileOutputStreamDemo fileOutputStream=new FileOutputStreamDemo();
		fileOutputStream.writeToFile(new File("c:\\EDUREKAIO\\message.txt"));
		
	}
	
	public void writeToFile(File file) throws IOException {
		FileOutputStream fileOutput=new FileOutputStream(file);
		fileOutput.write("Hey Happy Learnig".getBytes());
		fileOutput.close();
		
	}
}
