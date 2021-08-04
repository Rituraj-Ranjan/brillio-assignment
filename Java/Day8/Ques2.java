package assignment2;
import java.util.*;
public class Ques2 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c= sc.nextInt();
		//int a=1,b=-2,c=3;
		double d=(b*b)-(4*(a*c));
		double r1=0,r2=0;
		if (d>0) {
			r1=(-b+Math.pow(d, 0.5))/(2.0*a);
			r2=(-b-Math.pow(d, 0.5))/(2.0*a);
			System.out.println("r1:"+r1+"r2:"+r2);
		}
		else if (d==0) {
			System.out.println(r1);
		}
		else 
			System.out.println("Not have real roots");
		
	}

}
