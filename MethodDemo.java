package InputOutput;

public class MethodDemo {
	
	public static int sum(int n1,int n2) {
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			sum+=i;
			
			
		}
		return sum;
	}
		public static void main(String []args) {
			
		System.out.println("The sum of numbers between  and20 is "+sum(10,20));
		System.out.println("The sum of numbers between 10 and20 is "+sum(5,6));
		System.out.println("The sum of numbers between 10 and20 is "+sum(1,100000));
	}

}
