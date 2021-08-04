package assignment;

public class Face {

	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				char ch = '"';
				for (int j = 0; j < 8; j++) {
					if (j == 0)
						System.out.print(" ");
					else if (j == 1 || j == 7)
						System.out.print("+");
					else
						System.out.print(ch);
				}
			}
			if (i == 1) {
				for (int j = 0; j < 9; j++) {
					if (j==0)
						System.out.print("[");
					else if (j==8)
						System.out.print("]");
					else if (j==1||j==7)
						System.out.print("|");
					else if (j==3 || j==5)
						System.out.print("o");
					else 
						System.out.print(" ");
				}
			}
			if (i==2) {
				for (int j = 0; j < 9; j++) {
					
					if (j==1||j==7)
						System.out.print("|");
					else if (j==4)
						System.out.print("^");
					else 
						System.out.print(" ");
				}
			}
			if (i==3) {
				for (int j = 0; j < 9; j++) {
					
					if (j==1||j==7)
						System.out.print("|");
					else if (j==3 || j==5)
						System.out.print("'");
					else if (j==4)
						System.out.print("-");
					else 
						System.out.print(" ");
				}
			}
			if (i==4) {
				for (int j = 0; j < 8; j++) {
					if (j == 0)
						System.out.print(" ");
					else if (j == 1 || j == 7)
						System.out.print("+");
					else
						System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
