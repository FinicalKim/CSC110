/* 	--------------------------------------------------------------------------------------------------------------
                                              CSC110AB FixIfElseErrors


   	In this Minilab, there are 10 small if-else or switch sections.  Each one is described in a comment
   	but NONE of them work correctly.  The ones in the first section will not compile (syntax errors).
   	The others will compile, but are set up incorrectly so they produce the wrong results (logic errors).

   	The goal of this Minilab is to recognize these common and/or tricky errors, so that you do not
   	make them yourself.   Be sure that you UNDERSTAND why the errors occurred; it is not enough
   	to just "get it to work."
		1.	Fix the syntax errors in the first section so that they compile and run correctly
		2.	Fix the logic errors in the other sections so that they run correctly.  You should
		    change how the if, else-if, and/or switch statements are set up.

   	**** NOTE **********************************************************************
   	**  Specifically, you are NOT ALLOWED to change or add any line which has "result" in it.
   	**  Also - you are NOT ALLOWED to change or add lines that have System.out.print
   	**  or System.out.println in them
	*************************************************************************************

   Once you find the error in the if-else setup, you can do any of the following:
		- put in or take out { }'s (to be sure an else goes with the correct if)
		- put in or take out { }'s (to be sure an if controls the lines you think it does - indenting doesn't matter)
		- change && to || or vice versa (to be sure the &&, || logic is correct)
		- change ifs to else ifs (so that they all work together and the last else will execute when EVERYTHING
    	  is false)
		- take out ;'s that should not be there (to be sure there are no accidental empty statements)
		- put in or take out break statements as needed (to be sure the switch statement is set up correctly)
		- change ='s to =='s (to be sure that what is inside the if evaluates to a boolean instead of an assignment)
		- change < to <= or vice versa; same for > and >= (depending on whether the left hand side should be included, too)

	NOTES:
		- The result variable is built up using concatenation because sometimes the error causes multiple results
		  to be included.
		- Look closely at the code to determine what numbers you should enter when testing it.  Be sure
		  to test as many situations in the "if" parts and the "else" parts as you can.
		  (2,3,4,5 are good test input...)

	Submit this file after you have made your changes and tested it.   Do not change the name of the file.

   -------------------------------------------------------------------------------------------------------------
*/

import java.util.*;

public class FixIfElseErrors
{
	public static void main(String args[])
	{
		//declare variables
		String result;
		int x;
		int inputx;

		//prompt for, read in a value for x
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a value for x (integer): ");
		inputx = kb.nextInt();

		//************************************************************************
		//SECTION1:
		//The if-else statements in this section have syntax errors (will not compile).
		//Fix each of them so that it compiles and the proper result is printed.
		//************************************************************************
		System.out.println("\n\n\"Common syntax errors\" section");;
		x = inputx;


		//PART1 - if x has a value of 4, print "ddd", else print "eee"
		result = "";
		if (x == 4) 
			result = result + "ddd";
		else
			result = result + "eee";
		System.out.println("PART1: " + result);


		//PART2 - if x has a value of 3 or 4, print "ddd", else print "eee"
		result = "";
		if(x==3 || x==4)
			result = result + "ddd";
		else
			result = result + "eee";
		System.out.println("PART2: " + result);


		//PART3 - if x has a value of 4, print "ddd", else print "eee"
		result = "";
		if (x == 4)
			result = result + "ddd";
		else
			result = result + "eee";
		System.out.println("PART3: " + result);



		//************************************************************************
		//SECTION2:
		//Here are some common errors ones that are tricky.  This part will
		//compile, but will not give the correct result ("logic error").  Be sure you
		//UNDERSTAND the error (so you won't make it yourself).  Fix the error
		//so that the proper result is printed.
		//************************************************************************
		System.out.println("\n\"Common tricky errors\" section");
		x = inputx;


		//PART4 - if x has a value of 4, print "ddd", else the original "eee" is printed
		result = "eee";
		if (x == 4) 
		{
			result = "d";
			result = result + "dd";
		}
		System.out.println("PART4: " + result);
		

		//PART5 -	if x is even and is less than or equal to 5, print "ddd",
		//				but if x is not even, print "eee"
		result = "(nothing)";
		if (x%2 == 0) //even
		{
			if (x <= 5)
				result = "ddd";
	}
		else 
			result = "eee";
		System.out.println("PART5: " + result);


		//************************************************************************
		//a switch statement (with a common error)
		//************************************************************************
		System.out.println("\n\"Switch statement\" section");
		x = inputx;


		//PART6 -	if x has a value if 2, print "bbb"
		//				if x has a value of 3, print "ccc"
		//				if x has a value of 4, print "ddd"
		//				if x has a value other than 2, 3, or 4 print "eee"
		result = "";
		switch (x)
		{
			case 2:
				result = result + "bbb";
				break;
			case 3:
				result = result + "ccc";
				break;
			case 4:
				result = result + "ddd";
				break;
			default:
				result = result + "eee";
		}
		System.out.println("PART6: " + result);


		//************************************************************************
		//Miscellaneous - but fairly common - errors
		//************************************************************************
		System.out.println("\n\"Various common errors\" section");
		x = inputx;


		//PART7 - if x has a value that is larger than 4, print "eee", else print "ddd"
		result= "";
		if (x>4)
			result = result + "eee";
		else
			result = result + "ddd";
		System.out.println("PART7: " + result);


		//PART8 - if x has a value between 1 and 4 (inclusive), print "ddd"; else print "eee"
		result = "";
		if (x>=1 && x<=4)
			result = result + "ddd";
		else 
			result = result + "eee";
		System.out.println("PART8: " + result);


		//PART9 -   if x has a value of 4, print "ddd"       
		//if x has a value of 3, print "ccc"                  
		//if x has a value of 2, print "bbb"       
		//any other value (not 4,3,or 2), print "eee"
		result = "";
		if (x == 4) 
			result = result + "ddd";
		else if (x == 3) 
			result = result + "ccc";
		else if (x == 2) 
			result = result + "bbb";
		else 
		    result = result + "eee";
		System.out.println("PART9: " + result);


		//PART10 - if x has a value of 4, then print "ddd", else the original "eee" is printed
		result = "eee";
		if (x == 4)
			result = "ddd";
		System.out.println("PART10: " + result);

	}
}
