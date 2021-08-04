package assignment;
import java.util.*;
public class EndStr {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str1= sc.nextLine();
		String str2=sc.nextLine();
		int n=str2.length();
		
		String p= str1.substring(str1.length()-n,str1.length());
		System.out.println(p);
		if (str2.equals(p))
		System.out.println("True");
		else 
			System.out.println("False");
	}
}
