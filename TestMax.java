package InputOutput;

public class TestMax {
public static void main(String []aargs) {
	int i=58;
	int j=300;
	int k=max(i,j);
	
	System.out.println("The maximum number between "+i+"and "+j+"is "+k);
	System.out.println("Once you know Something it becomes Simple Trust me!!!");	
}
public static int max(int i,int j) {
	int num=0;
	if(i>j) {
		return num=i;
	}else
		return num=j;
}
}
