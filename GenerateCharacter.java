package InputOutput;

public class GenerateCharacter {
	
	public static char generateRandomCharacter(char ch1,char ch2) {
		
	  return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));

	}
	
	
	public static char getUpperCaseChar(){
	return	generateRandomCharacter('A','Z');
	}
	
	public static char getLowerCaseChar() {
	return generateRandomCharacter('a','z');
	}
	
	public static char getNumbers() {
		return 1+1;
	}
	public static char generateRandomCharacter() {
		return generateRandomCharacter('\u0000', '\uFFFF');
	}
	
	
	public static void main(String []args) {
		
	System.out.println(generateRandomCharacter('a','x'));
	}
}
