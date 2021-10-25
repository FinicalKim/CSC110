import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// Make sure to capitilize the S in Scanner at the top in line 1
		// also can use nextDouble()
		// typecast z= (double) type cast before you enter value
		   
		
		System.out.println("CSCS110   \n\nMath220" + "MAT230");
		System.out.println("   \tBio205   Chm151");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		input.nextLine();
		
		String name = input.nextLine();
		
		// String x = input.next();
		// String x = input.nextline(); will print multiple tokens in one line
		/* You cannot put text before int for input because it will skip it so you will 
		 * need int before a string  ask keyboard for a string first  */
		
		System.out.println("The x= " + x);
		
		
		// Boolean signs : >, <, >=, <=, ==, != , =!
		// ternary operator ?
		
		int k = 2 , y = 13;
		double z = 0.0;
		k = k + y;
		
		if (k > y) {
			y ++ ;
			k -- ;
			}
		
			else if (y > k) {
				y ++ ;
				k -- ;
			
		}
		z = z + 2.5;
		y ++ ;
		
		
		int j = 2;
		
		switch (j+1)
		{
		case 10: System.out.println("A"); break;
		case 9: System.out.println("B");
		case 4: System.out.println("C");
		case 2: System.out.println("D"); break;
		case 15: System.out.println("E");
		
		default: System.out.println("CSC110");
		}
		
		
		/*With brackets the compiler will continue to run this code
		 *  (for) Loops, can add more brackets to run it more than once*/
		
		int a = 2, b = 3;
		for(int i = 0; i < 3; i ++)
		{
		System.out.println("a");
		}
		
		
		int c = 2, d = 15;
		
		/* for ( int i = 0 ) starting level of function, ( i < 2 ) 
		 * ending level of function, ( i = i + 1 ) summation of the function until end point is met
		 */
		
		for( int i=0 ; i < 2 ; i = i + 1)
		{
		System.out.print("A");
		}
	     /*for ( initialization ; condition ; increment )
		   statement*/
	
		
		 /*for( int i=0 ; i > 3 ; i = i ++ )
		 *{
		 *System.out.print("A");
		 *}
		 * This will have no output (false)
		 * 
		 */
		
		
		
		int e = 0;
		while( e<3 )
		{
			System.out.println("CSC110");
			e++;
		}
		
		
		/*initialization
		 * while(condition)
		 * {
		 * (statement)
		 * increment
		 * }
		 * 
		 * 
		 */
		
		int f = 0;
		do
		{
			System.out.print("gg");
			
			
		f++;
		}while( f > 3);
		
		/*
		 * do while loop will print the statements once if the conditions are false
		 */
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	
		
		}
		

}
