package zoho.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1_Locker {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter locker no:");
			String locker_name = br.readLine();
			
			List<String> alphabets = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
			
			int result = 0;
			
			if(locker_name.length() == 1) {
				result = alphabets.indexOf(locker_name) + 1;
			} else if(locker_name.length() == 2) {
				int a = alphabets.indexOf(String.valueOf(locker_name.charAt(0))) + 1;
				int b = alphabets.indexOf(String.valueOf(locker_name.charAt(1))) + 1;
				result = 26 * a + b;
			}
			
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
