package assignment2;

public class Ques8 {

	public static void main(String args[]) {
		
		int n=1432;
		int num=n,p=0;
		while (n>0) {
			p=p*10;
			p=p+(n%10);
			n=n/10;
		}
		if (num==p)
			System.out.println("It is pallindrome");
		else 
			System.out.println("Not a plaindrome");
	}
	
}
