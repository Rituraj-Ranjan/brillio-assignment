package assignment2;

import java.util.Scanner;

public class Ques10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		for (int i=0;i<10;i++) {

			System.out.println(a);
			int c=b;
			b=a+b;
			a=c;
		}
	}
}
