package practicePrograms;

import java.util.Scanner;

public class SigmaExample {
      int Sigma(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum +=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		SigmaExample obj = new SigmaExample();
		int result = obj.Sigma(n);
		System.out.println("Sum from 1 to " + n + " = " + result );
		

	}

}
