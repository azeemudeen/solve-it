package codechef.problems;

import java.util.Scanner;

public class Problem12_TotalExpense {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			double quantity = sc.nextInt();
			double price = sc.nextInt();
			double totalPrice = quantity * price;
			
			if(quantity > 1000) {
				totalPrice = totalPrice - ((totalPrice/100)*10);
			}
			System.out.println(totalPrice);
		}
		sc.close();
	}
}
