package contro;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		System.out.println("give the required line");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			for (int i = 0; i <n; i++) {
				System.out.print("1");	
				
			}
			System.out.println("");
			n--;
		}
	}

}
