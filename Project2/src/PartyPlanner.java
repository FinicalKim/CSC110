import java.util.Scanner;

public class PartyPlanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter the name of the person the party is for: ");
		String name = input.nextLine();
		
		
		System.out.print("\nHow old is this person now? ");
		byte age = input.nextByte();
		
		System.out.print("\nHow many people are invited? ");
		int invitations = input.nextInt();
		
		System.out.print("\nHow many balloons are needed? ");
		int balloons = input.nextInt();
		
		System.out.print("\nNumber of brownies ordered: ");
		int brownies = input.nextInt();
		
		System.out.print("\nWhat is the price of each brownie? " );
		double browniePrice = input.nextDouble();
		
		System.out.println("\n\n\nThe party is for " + name);
		System.out.println(name + " will turn " + ++ age);
		System.out.println(name + " is now " +  -- age);
		System.out.println("The TOTAL cost of the " + brownies + " brownies is: " + brownies * browniePrice);
		System.out.println("The number of guests is: " + invitations);
		System.out.println("Number of brownies per guest is: " + (double) brownies / invitations);
		System.out.println("Number of balloons per guest is: " + balloons / invitations);
		System.out.println("Number of balloons left over is: " + balloons % invitations);
		

	}

}
