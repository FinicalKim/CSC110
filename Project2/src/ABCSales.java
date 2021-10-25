import java.util.Scanner;
public class ABCSales {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter name: ");
		String name = input.nextLine();
		
		
		System.out.print("Please enter the first week's hours worked (as an integer): ");
		int week1 = input.nextInt();
		
		System.out.print("Please enter the second week's hours worked (as an integer): ");
		int week2 = input.nextInt();
		
		System.out.print("Please enter the third week's hours worked (as an integer): ");
		int week3 = input.nextInt();
		
		System.out.print("Please enter the fourth week's hours worked (as an integer): ");
		int week4 = input.nextInt();
		
		System.out.print("\nPlease enter number of sales calls made (as an integer): ");
		int salesCalls = input.nextInt();
		
		int totalHours = week1 + week2 + week3 + week4;
		
		double averageHours = ((double)totalHours / 4) ;
		
		double vacationHours = (totalHours * 0.05) ;
		
		int equavalentWeeks = (totalHours / 40);
		
		int totalDaysVar = (totalHours / 40) * 40;
		int equavalentDays = ( totalHours - totalDaysVar ) / 8;
		
		int equavalentHours = ( totalHours - totalDaysVar ) % 8;
		
		double averageSalesCalls = (salesCalls / (double) totalHours );
				
		System.out.println("\n\n\t" + name);
		
		System.out.println("\t\tTotal hours worked: " + totalHours);
		
		System.out.println("\t\tAverage hours per week: " + averageHours);
		
		System.out.println("\t\tVacation hours earned: " + vacationHours);
		
		System.out.println("\t\t\tEquivalent weeks: " + equavalentWeeks);
		
		System.out.println("\t\t\tEquivalent days: " + equavalentDays);
		
		System.out.println("\t\t\tEquivalent hours: " + equavalentHours);
		
		if( averageSalesCalls >= 0 )  
		{
		System.out.print("\t\tAverage sales calls per hour: " +  averageSalesCalls + "\n");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
