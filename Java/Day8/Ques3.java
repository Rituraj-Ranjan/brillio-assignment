package assignment2;

import java.util.*;
public class Ques3 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner( System.in);
		int year=sc.nextInt();
		boolean leap=true;
		if ((year%4==0&&year%100!=0)||year%400==0)
		System.out.println("Leap Year");
		else 
			System.out.println("Not a leap year");
	}
}
