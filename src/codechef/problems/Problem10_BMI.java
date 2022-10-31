package codechef.problems;

import java.util.Scanner;

public class Problem10_BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int mass = sc.nextInt();
			int height = sc.nextInt();
			int bmi = mass/(height*height);
			
			if(bmi < 19) {
				System.out.println(1);
			} else if (bmi < 25) {
				System.out.println(2);			
			} else if (bmi < 30) {
				System.out.println(3);
			} else {
				System.out.println(4);			
			}
		}
		sc.close();
	}
}
