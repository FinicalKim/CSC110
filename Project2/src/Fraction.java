import java.util.Scanner;	//detects user input from the output window
public class Fraction {		//class Fraction
	
	static Scanner input = new Scanner(System.in);
	
	//Global Variables
	
	private int numerator;
	
	private int denominator;
	
	//Methods
	
	public String toString()
	{
		return  numerator + "/" + denominator ;
		
	}
	
	public double evaluate()
	{
		
		return (double) numerator/denominator;
	}
	
	public boolean isImproper()
	{
		if( numerator > denominator )
			return true;
		else
			return false;
	}
	
	public Fraction multiplyBy(Fraction another)
	{
		Fraction f = new Fraction(this.numerator*another.numerator, this.denominator*another.denominator);
		
		return f;
	}
	
	public void invert()
	{
		if(numerator == 0)
		throw new IllegalStateException("<I cannot be divide by 0>");
		
		int inv = this.numerator;
		numerator = denominator;
		denominator = inv;
	} 
	
	//Constructors
	
	public Fraction()	//Default constructor
	{
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int i)	//Constructor with one parameter
	{
		numerator = i;
		denominator = 1;
	}
	
	public Fraction(int k, int j)//Constructor with two parameters
	{
		if (j == 0)
			throw new IllegalArgumentException("I cannot divide by zero ");
		
		numerator = k;
		denominator = j;
		
	}
	
}
