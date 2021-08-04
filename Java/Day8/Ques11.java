package assignment2;

import java.util.Scanner;

public class Ques11 {

	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max= Integer.MIN_VALUE;
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if (max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
	}
}
