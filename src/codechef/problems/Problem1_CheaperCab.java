package codechef.problems;

import java.util.Scanner;

public class Problem1_CheaperCab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int cab1 = sc.nextInt();
			int cab2 = sc.nextInt();
			
			if(cab1 < cab2) {
				System.out.println("FIRST");
			} else if(cab1 > cab2) {
				System.out.println("SECOND");
			} else {
				System.out.println("ANY");
			}
		}
		sc.close();
	}
}
