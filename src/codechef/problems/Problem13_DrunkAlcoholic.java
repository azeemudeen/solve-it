package codechef.problems;

import java.util.Scanner;

public class Problem13_DrunkAlcoholic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int seconds = sc.nextInt();
			int forwardSteps = 0;
			for(int i=1; i<=seconds; i++) {
				if(i%2 == 0) {
					forwardSteps -= 1;
				} else{
					forwardSteps += 3;
				}
			}
			System.out.println(forwardSteps);
		}
		sc.close();
	}
}
