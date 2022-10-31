package codechef.problems;

import java.util.Scanner;

public class Problem7_CupFinals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int firstTeamSkill = sc.nextInt();
			int secondTeamSkill = sc.nextInt();
			int allowedDiff = sc.nextInt();
			
			int diff = Math.abs(firstTeamSkill - secondTeamSkill);
			
			if(diff > allowedDiff) {
				System.out.println("NO");
			} else {
				System.out.println("YES");			
			}
		}
		sc.close();
	}
}
