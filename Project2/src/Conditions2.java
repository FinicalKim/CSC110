import java.util.Scanner;

public class Conditions2 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
		double num1, num2, num3, min = 0;
	
	System.out.println("Enter three numbers separated by a space:");
	
	num1 = input.nextDouble();
	num2 = input.nextDouble();
	num3 = input.nextDouble();

if (num1 > num2)
	if (num1 > num3)
		min = num1;
	else
		min = num3;
else 
	if (num2 > num3)
		min = num2;
	else
		min = num3;

System.out.print(min + " is the highest.");


	}

}
