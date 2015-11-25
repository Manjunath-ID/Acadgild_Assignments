import java.util.Scanner;


public class NumberOfDaysInMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nFIND NUMBER OF DAYS IN A MONTH BASED ON YEAR:\n");
		System.out.println("1-JANUARY \t 2-FEBRUARY \t 3-MARCH \t 4-APRIL \t\n" +
	            "5-MAY \t 6-JUNE \t 7-JULY \t 8-AUGUST \t\n" +
	            "9-SEPTEMBER \t 10-OCTOBER \t 11-NOVEMBER \t 12-DECEWMBER \t");

		System.out.println("Please Enter the Year in (yyyy) format:");
		Scanner yearIn = new Scanner(System.in);
		int year = yearIn.nextInt();
		System.out.println("Please Enter the month number based on above description:");
	    Scanner monthNumin  = new Scanner(System.in);
	    int monthNumber  = monthNumin.nextInt();
	    int FebDays;
	    if(year%400==0){
	    	if(monthNumber==2){
	    	FebDays = 29;}
	    	else{
	    	FebDays = 28;
	    	}
	    }
	    else if(year%4==0){
	    	if(monthNumber==2){
		    	FebDays = 29;}
		    	else{
		    	FebDays = 28;
		    	}
		    }
	    else{
	    	FebDays = 28;
	    }
	    switch(monthNumber){
	    case 1: System.out.println("Month name: JANUARY ");
	    		System.out.println("This month has 31 Days");
	    break;
	    case 2: System.out.println("Month name: FEBRUARY ");
	    		System.out.println("This month has "+FebDays+"Days");
	    				break;
	    case 3: System.out.println("Month name: MARCH ");
				System.out.println("This month has 31 Days");
		break;
	    case 4: System.out.println("Month name: APRIL ");
				System.out.println("This month has 30 Days");
	    break;
	    case 5: System.out.println("Month name: MAY ");
				System.out.println("This month has 31 Days");
	    break;
	    case 6: System.out.println("Month name: JUNE ");
	    		System.out.println("This month has 30 Days");
	    break;
	    case 7: System.out.println("Month name: JULY ");
				System.out.println("This month has 31 Days");
	    break;
	    case 8: System.out.println("Month name: AUGUST ");
				System.out.println("This month has 31 Days");
	    break;
	    case 9: System.out.println("Month name: SEPTEMBER ");
				System.out.println("This month has 30 Days");
	    break;
	    case 10: System.out.println("Month name: OCTOBER ");
				System.out.println("This month has 31 Days");	
	    break;
	    case 11: System.out.println("Month name: NOVEMBER ");
				System.out.println("This month has 30 Days");
	    break;
	    case 12: System.out.println("Month name: DECEMBER ");
				System.out.println("This month has 31 Days");
	    break;
	    default: System.out.println("Invalid Month number entered ");
	    break;
	    }
	}

}
