package codechef.problems;

import java.util.Scanner;

public class Problem9_GrossSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			double basicSalary = sc.nextInt();
			double HRA=0, DA=0, grossSalary=0;
			
			if(basicSalary >= 1500) {
				HRA = 500;
				DA = getPercentageValue(basicSalary,98);
			} else {
				HRA = getPercentageValue(basicSalary, 10);
				DA = getPercentageValue(basicSalary, 90);
			}
			grossSalary = basicSalary + HRA + DA;
			System.out.println(grossSalary);
		}
		sc.close();
	}
	
	private static double getPercentageValue(double value, int percent) {
		return (value/100) * percent;
	}
}
