import java.util.Scanner;
public class Conditions1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
System.out.println("Enter your birth year:");
	int year = input.nextInt();
	
if (year >= 1997) {
	System.out.println("Generation Z");
}
else if (year >= 1981 && year <= 1996){
	System.out.println("Generation Y");
}
if (year >= 1965 && year <= 1980) {
	System.out.println("Generation X");
}
else if(year >= 1946 && year <= 1964){
	System.out.println("Baby Boomers");
}
if (year >= 1883 && year <= 1945) {
	System.out.println("Lost Generation");
}
else if (year < 1883){
	System.out.println("Wow, you are old!");
}
	
	}

}
