package assignment;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String args[]) {
		StringBuilder str= new StringBuilder();
		Scanner sc=new Scanner(System.in);
		str.append(sc.nextLine());
		System.out.println(str);
		int n=sc.nextInt();
		String p=sc.next();
		str.replace(n-1, n, p);
		System.out.println(str);
	}
}
