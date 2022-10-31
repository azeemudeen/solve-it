package codechef.problems;

import java.util.Scanner;

public class Problem4_Choclate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int noOfFive = sc.nextInt();
			int noOfTen = sc.nextInt();
			int choclateCost = sc.nextInt();
			int amount = (noOfFive * 5) + (noOfTen * 10);
			int noOfChoc = amount/choclateCost;
			System.out.println(noOfChoc);
		}
		sc.close();
	}
}
