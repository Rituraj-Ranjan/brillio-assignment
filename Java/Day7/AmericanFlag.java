package assignment;

public class AmericanFlag {
	
	public static void main (String Args[]) {
		for (int i=0;i<15; i++) {
			for (int j=0;j<46;j++) {
				if (i<9) {
					if (j<12) {
						if (i%2==0) {
							if(j%2==0) {
								System.out.print("*");
							}
							else {
								System.out.print(" ");
							}
						}
						else {
							if(j%2==0) {
								System.out.print(" ");
							}
							else {
								System.out.print("*");
							}
						}
					}
					else if (j==12) {
						System.out.print(" ");
					}
					else {
						System.out.print("=");
					}
				}
				else 
				System.out.print("=");
			}
			System.out.println();
		}
	}

}
