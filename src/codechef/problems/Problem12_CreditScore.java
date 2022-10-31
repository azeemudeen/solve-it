package codechef.problems;

import java.util.Scanner;

public class Problem12_CreditScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentScore = sc.nextInt();

		if(currentScore >= 750) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
