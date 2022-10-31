package codechef.problems;

import java.util.Scanner;

public class Problem11_VolumeControl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int initVol = sc.nextInt();
			int finalVol = sc.nextInt();
			
			int result = Math.abs(finalVol - initVol);
			System.out.println(result);
		}
		sc.close();
	}
}
