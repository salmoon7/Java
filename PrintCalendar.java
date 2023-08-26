package InputOutput;
import java.util.Scanner;


public class PrintCalendar {
/**Main method*/
	public static void main(String []args) {
		//Prompt user to Enter year 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter full number of year e.g., 2010");
		int year=input.nextInt();
		
		//Prompt user to enter month
		System.out.println("Enter the month in number between 1-12,e.g., january -1");
		
		
		int month=input.nextInt();
	
			System.out.println("Enter Month in Numbers");
		
		//Print   Calendar for the Month of the year
		printMonth( year, month);
		
	}
	public static int printMonth(int year,int month) {
		//Print Month title
		printMonthTitle(year, month);
		//Print the month body
		printMonthBody(year,month);
		return month;
		
	}
	//The method to print the month title e.g., March 2013
	public static void printMonthTitle(int year,int month){
		System.out.println("      "+getMonthName(month) +" "+year);
		System.out.println("----------------------------------");
		System.out.println("Sun Mon Tue Wed Thur Fri Sat ");
	}
	public static String getMonthName(int month) {
		String monthName=" ";
	switch (month){
			case 1:monthName="January"; break;
			case 2:monthName="Febuary";break;
			case  3:monthName="March";break;
			case 4:monthName="April";break;
			case 5:monthName="May";break;
			case 6:monthName="June";break;
			case 7:monthName="July";break;
			case 8:monthName="August";break;
			case 9:monthName="September";break;
			case 10:monthName="October";break;
			case 11:monthName="November";break;
			case 12:monthName="December";break;
			}
		return monthName;
		}
	//Print MonthBody
	public static void printMonthBody(int year,int month) {
		//Get the days each Months start
		int startDay=getStartDay(year,month);
		//To get the number of days in the hub
		int numberOfDaysInMonth=getNumberOfDaysInTheMonth(year,month);
		
		//create space of dates and days
		int i=0;
		for(i=0;i<startDay;i++)
				System.out.print("   ");
		for(i=1;i<=numberOfDaysInMonth;i++) {
			System.out.printf("%4d",i);
		if((i+startDay)%7==0)
			System.out.println();
	}
	System.out.println();
	
	}
	public static int getStartDay(int year,int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		  // Get total number of days from 1/1/1800 to month/1/year
		  int totalNumberOfDays = getTotalNumberOfDays(year, month);
		 
		  // Return the start day for month/1/year
		  return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
		
	}
private static int getTotalNumberOfDays(int year, int month) {
		// TODO Auto-generated method stub
	int total = 0;
	 
	 // Get the total days from 1800 to 1/1/year
	  for (int i = 1800; i < year; i++)
	  if (isLeapYear(i))
	  total = total + 366;
	  else
	 total = total + 365;
	
 // Add days from Jan to the month prior to the calendar month
	 for (int i = 1; i < month; i++)
	 total = total + getNumberOfDaysInTheMonth(year, i);
	
	 return total;
		
	}

private static int getNumberOfDaysInTheMonth(int year, int month) {
	if (month == 1 || month == 3 || month == 5 || month == 7 ||
			 month == 8 || month == 10 || month == 12)
			 return 31;
			
			 if (month == 4 || month == 6 || month == 9 || month == 11)
			 return 30;
			
			 if (month == 2) return isLeapYear(year) ? 29 : 28;
	return 0;
}
private static boolean isLeapYear(int year) {
	return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	
}
}
