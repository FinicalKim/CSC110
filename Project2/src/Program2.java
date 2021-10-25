import java.util.Scanner;	//receives input from user in output window
public class Program2 {	//classProgram2

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a month, day, and year (as integers, separated by spaces):  "); 
		
		int month = input.nextInt();	//input for month
		
		int day = input.nextInt();	//input for day
		
		int year = input.nextInt();		//input for year
		
		
		
		boolean leapYear;
		
		if((year % 400) == 0)	
			leapYear  = true;
		else if ((year % 100) == 0)
			leapYear = false;
		
		else if ((year % 4) == 0)
			leapYear = true;
			else 
				leapYear = false;
		if (leapYear&&day==1&&month==3)//Statement for detecting an input of a leap year
		{
			day=30;
			month=2;
		}
		
		if(month==1&&day==1)//Statement for January
		{
			day=32;
			month=12;
			--year;
					
		}
		
		else if (month==2&&day==1)//Statement for February
		{
			day=32;
			month=1;
			
		}
		else if(month==3&&day==1)//Statement for March
		{
			day=29;
			month=2;
			
		}
		else if(month==4&&day==1)//Statement for April
		{
			day=32;
			month=3;
			
		}
		else if(month==5&&day==1)//Statement for May
		{
			day=31;
			month=4;
			
		}
		else if(month==6&&day==1)//Statement for June
		{
			day=32;
			month=5;
			
		}
		else if(month==7&&day==1)//Statement for July
		{
			day=31;
			month=6;
			
		}
		else if(month==8&&day==1)//Statement for August
		{
			day=32;
			month=7;
		}
		else if(month==9&&day==1)//Statement for September
		{
			day=32;
			month=8;
		}
		else if(month==10&&day==1)//Statement for October
		{day=31;
		month=9;
			
		}
		else if(month==11&&day==1)//Statement for November
		{
			day=32;
			month=10;
		}
		else if(month==12&&day==1)	//Statement for December
		{
			day=31;
			month=11;
		}
		

		System.out.println("Yesterday was: " + month + "/" + --day + "/" + year);	//prints yesterdays inputed date (Month/Day/Year)
		
	}
		
		
}