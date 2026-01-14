package COMP1008W2026.Lab01;
import java.util.Scanner;

//Thiemi Soubhia Doi - 200645138
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/

 
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String weather;
	    String precipitation;
	    String windSpeed;
	    double dailyHigh;
	    double dailyLow;
	    int uv;

 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */

        // TODO: Prompt user and read input
        System.out.println("---Week 2 Lab: Weather Report Program---");
        System.out.println("Today's weather conditions:");
	    weather = input.nextLine();
 	    System.out.println("Possibility of precipitation:");
	    precipitation = input.nextLine();
	    System.out.println("Wind speed:");
	    windSpeed = input.nextLine();

        // TODO: Use loops to validate high/low temperatures and UV index
        System.out.println("Daily high temperature:");
	    dailyHigh = input.nextDouble();
	    System.out.println("Daily low temperature:");
	    dailyLow = input.nextDouble();

	    //daily temperature verification
	    while(dailyHigh < dailyLow){
		    System.out.println("Invalid daily low and/or high temperature!!");
		    System.out.println("Daily low needs to be lower than the high temperature");
		    System.out.println("Please inform again... Daily high temperature:");
		    dailyHigh = input.nextDouble();
		    System.out.println("Daily low temperature:");
		    dailyLow = input.nextDouble();
	    }

 	    System.out.println("UV index:");
	    uv = input.nextInt();
	    //uv verification
	    while (uv < 0 || uv > 12) {
    	    System.out.println("Invalid UV index!!");
    	    System.out.println("UV index must be between 0 and 11");
    	    System.out.println("Please enter a valid UV index:");
    	    uv = input.nextInt();
        }
 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
        // TODO: Apply typecasting where necessary
        int dailyHighInt = (int) dailyHigh;
	    int dailyLowInt = (int) dailyLow;
        
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */

        // TODO: Write if, if-else, or nested if statements to display tips


 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
 
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
 