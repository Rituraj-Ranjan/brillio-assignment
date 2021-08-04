package assignment2;
import java.util.Scanner;
public class Ques6 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner (System.in);
		int []arr= new int[5];
		double sum =0;
		double avg=0;
		for (int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		avg=sum/5;
		System.out.println("Sum :"+sum+"Avg :"+avg);
		
	}
	
}
