package tripPlanToUsa;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.time.zone.*;

public class Tripplanner {      // Trip Plan To The United States of America.

	public static void main (String[] args) {
		
		
		
		// Part 1- Greeting.
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello there! How can I help you today?");
		
		String greeting = input.nextLine();
		
		System.out.println(); // Ahh,,I want to go for a trip.
		
		System.out.println("Great! I can help you with the trip plan. Whats your name sir?");
		String name = input.nextLine();  // Dhurba.
		
		System.out.print("Mr. Dhurba, How are you doing today?");
		String greeting1 = input.next();  // Good. Thank You.
		
		System.out.println("Great!! So, Where you would like to go Mr. Dhurba?");
		String place = input.next();   // United States of America.
		
		System.out.print("USA !! Sounds like a Great Trip.");
	    String greeting2 = input.nextLine();// Thank you.
		
		
	    
	    //Part 2- Travel Time and Budget.
		
		
	    
	    System.out.println("So, How many days you want to go for a Trip? ");
		int num = input.nextInt();  // 30 days( Question can we put int and string at a same time?)
		String alphanumeric = "30";
		// 30 seraptely
		// days separate
		//int num = alphanumeric.
		 // delimeter and parse  // make changes to your data type 
	    System.out.println("Great!! What is your total budget for this trip?");
	    float value = input.nextInt();
	    
	    System.out.println("Enough Money, Great!.");
	    
	     int d  = num;   			// 1 day = 24 hours
	    
	    int Hours = (d*24);			// 1 hour = 60 minute
	    int minuts = (Hours*60);	// 1 minute = 60 second
	    int seconds =(minuts*60);
	    
	    System.out.println("So, you gonna spend following time in your trip in days,hours, minuts and seconds");
	    System.out.println(d+" "+"days");
	    System.out.println(Hours +" "+"Hours");
	    System.out.println(minuts +" "+"Minuts");
	    System.out.println(seconds+" "+"Seconds");
	    
	   // String agreed = input.next();  //  Oh sounds fun
	    
	   // System.out.println("Yea...For sure !!");
	    
	    float m = value;
	   
		float usd = (value/110); //( 1USD = 110 NRS.)
	    float perday= (usd/d);
	    
	   //System.out.printf(" %.2f", perday);
	    	    
	    	   System.out.printf("And , Your all budget in USD is "+" "+"$"+usd+" "+"And you can spend"+" "+"$"+perday+" everday");
	           String thank = input.next();// Really!! Sounds like a great budget. Thank you.
	            
	    	    
	    	    System.out.println("Thank You. By the way, How many hours time difference between Nepal and USA?");
	            
	            
	           
	            //Part-3 Time Difference
	          
	            
	            
	            
	    int time = input.nextShort();
	            
    /*    TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        SimpleDateFormat Time_formate= new SimpleDateFormat("hh:rr:ss");
	     
        String Time= Time_formate.format(time);
	   System.out.println(Time);
    */    
        
        		int  tm = time;
	    time= time -(1200);
	   
	    double midnight = (double)2400;
	    double noon =(double)1200;
	           
	            
	    System.out.println("Then, When it will be midnight in Your home the time in US"
	            		+ " is"+" "+(tm+midnight)+" " +"and when noon in your home town the time in US is "+(tm+noon));
	            
	            
	            
	            
	           // Part 4- Country Area
	            
	            
	            
	            System.out.println("And ,Do you know the area of the USA ?");
	            double area = input.nextFloat();
	            
	            double A = area;        // 1 miles= 1.6km
	            A =(area/1.6);
	            
	            System.out.println("Then, You gonna visit" +" "+A+" "+"miles in the USA.");
	            
	            String thank1 =input.next();// Thank You For Your Help.
	            
	            System.out.println("NO Problem. Enjoy Your Trip. Have a Good Day.");
	            
	}


	

}
