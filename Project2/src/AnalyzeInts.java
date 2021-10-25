import java.util.Scanner;
public class AnalyzeInts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int num = input.nextInt();
		
		if (num < 0) {
			System.out.println(num + " is negative");}
		if (num % 7 == 0) {
			System.out.println(num + " is divisible by 7");}
		if (num % 2 == 0) {
			System.out.println(num + " is even");}
		else 
			System.out.println(num + " is odd");
		if (num >= 13 && num <= 17) {
			System.out.println(num + " is between 13 (inclusive) and 20 (exclusive)");
			System.out.println(num + " is in the teens");}
		if ((num > 9 && num < 100) || (num < -9 && num > -100)) {
			System.out.println(num + " has at least 2 digits");}
		
		
		
	}

	
	
}
