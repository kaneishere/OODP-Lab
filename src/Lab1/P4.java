package Lab1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height;
		boolean A = true;
		System.out.println("Enter height: ");
		height = scan.nextInt();
		
		if(height<=0) 
			System.out.println("Error input!!");
		
		else {
			for(int i = 0; i<height; i++) {
				for(int j = 0; j<i+1; j++) {
					if((i%2==0 && j%2==0) || (i%2==1 && j%2==1)) System.out.print("AA");
					else System.out.print("BB");
				}
				System.out.print("\n");
			}
		}

	}

}
