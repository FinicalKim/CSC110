import java.util.Scanner;
public class MinilabLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num1 = input.nextInt();
		
		System.out.println("Now enter an integer greater than " + num1 + ":");
		int num2 = input.nextInt();
		
		
		
		while(num2 <= num1) 
		{
		System.out.print("The second integer should be greater than " + num2 + ". Please reenter: ");
		num2 = input.nextInt();
		}
		
		int option;
		do
		{
		
			System.out.println("\nPlease choose an option");
			     System.out.println("  1.  Print numbers from " + num1 + " up to " + num2);
			     System.out.println("  2.  Print EVEN numbers from " + num1 + " up to " + num2);
				 System.out.println("  3.  Print numbers from " + num2 + " down to " + num1);
				 System.out.println("  4.  Print the TOTAL of numbers from " + num1 + " up to " + num2);
				 System.out.println("  5.  Quit");
		         option = input.nextInt();
		        
		    switch(option)    
		    {
		    
		         case 1:
		        	 System.out.print("\nAscending: ");
		        	 for (int i = num1; i <= num2; i++ )
		        	 {
		        		 System.out.print(i + " ");
		        	 }
		        	 break;
		         case 2:
		        	 System.out.print("\nEvens: ");
		         for (int i = num1; i <= num2; i++ ) 
		        	 {
		        		 if (i % 2 == 0)
		        		 System.out.print(i + " ");
		             }
		        	 break;
		         case 3:
		        	 System.out.print("\nDescending: ");
		        	 for (int i = num2; i >= num1; i-- ) 
		        	 {
		        		 System.out.print(i + " ");
		             }
		        	 break;
		         case 4:int num3 = 0;
		        	 System.out.print("\nTotal: ");
		        	 for (int i = num1; i <= num2; i++ ) {
		        		 num3 = i + num3;
		        	 }
		        	 {
		        		 System.out.print(num3);
		        	 }
		        	 break;
		         case 5:
		        	 
		        	 break;
		         default:
		        	 System.out.print("Illegal option, try again");
		        	 
		     
		     }
		
		}while(option != 5 );
		
		
		    }
		    
		  
		
	}
	

	
		    