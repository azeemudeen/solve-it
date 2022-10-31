package codechef.problems;

import java.util.Scanner;

public class Problem2_Rating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int currentRating = sc.nextInt();
			int currentDifficulty = sc.nextInt();
			
			if(currentDifficulty >= currentRating && currentDifficulty <= (currentRating+200)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");				
			}
		}
		sc.close();
	}
}
