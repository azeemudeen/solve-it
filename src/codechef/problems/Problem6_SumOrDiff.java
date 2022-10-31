package codechef.problems;

import java.util.Scanner;

public class Problem6_SumOrDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		if(firstNum > secondNum) {
			System.out.println(firstNum - secondNum);
		} else {
			System.out.println(firstNum+secondNum);
		}
		sc.close();
	}
}
