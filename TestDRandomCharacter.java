package InputOutput;

public class TestDRandomCharacter {
public static void main(String []args) {
	final int NUM_OF_CHARS=175;
	final int CHARS_PER_LINES=25;
	
		for(int i=0;i<NUM_OF_CHARS;i++) {
			char ch=GenerateCharacter. getLowerCaseChar();
			if((i+1)%CHARS_PER_LINES==0)
				System.out.println(ch);
			else 
				System.out.print(ch);
		}
}
}
