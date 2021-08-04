package assignment;

import java.util.Scanner;

public class PowerCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int pow=sc.nextInt();
		System.out.println(Math.pow(num,pow));
	}
}
