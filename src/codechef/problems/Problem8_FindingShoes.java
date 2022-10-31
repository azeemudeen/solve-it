package codechef.problems;

import java.util.Scanner;

public class Problem8_FindingShoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0){
		    int friends = sc.nextInt();
		    int leftShoes = sc.nextInt();
		    if(leftShoes <= friends) {
		    	int requiredPairs = friends * 2;
		    	int diffLeftShoeInPairs = Math.abs(requiredPairs - leftShoes);
		    	System.out.println(diffLeftShoeInPairs);
		    }else {
		    	System.out.println(friends);
		    }
		}
		sc.close();
	}
}
