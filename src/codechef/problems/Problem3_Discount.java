package codechef.problems;

import java.util.Scanner;

public class Problem3_Discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int discount = sc.nextInt();
			int sellingPrice = sc.nextInt();
			
			System.out.println(discount - sellingPrice);
		}
		sc.close();
	}
}
