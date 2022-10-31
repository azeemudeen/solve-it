package codechef.problems;

import java.util.Scanner;

public class Problem5_MilleageMatters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			float distanceToTravel = sc.nextInt();
			float petrolPerLitre = sc.nextInt();
			float dieselPerLitre = sc.nextInt();
			float distancePerLiterForPetrol = sc.nextInt();
			float distancePerLiterForDiesel = sc.nextInt();
			
			float priceForPetrol = (distanceToTravel/distancePerLiterForPetrol)*petrolPerLitre;
			float priceForDeisel = (distanceToTravel/distancePerLiterForDiesel)*dieselPerLitre;
			if (priceForPetrol > priceForDeisel) {
				System.out.println("DIESEL");
			} else if (priceForPetrol < priceForDeisel) {				
				System.out.println("PETROL");
			} else {
				System.out.println("ANY");				
			}
		}
		sc.close();
	}
}
