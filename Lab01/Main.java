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
        boolean answer = true;

        do {
            /*
             * STEP 1: Declare variables for weather information
             * a) Today's weather conditions (String)
             * b) Possibility of precipitation (String)
             * c) Wind speed (String)
             * d) Daily high temperature (int or double)
             * e) Daily low temperature (int or double)
             * f) UV index (int)
             */

            // TODO: Declare your variables here
            String weather;
            String precipitation;
            String windSpeed;
            double dailyHigh;
            double dailyLow;
            int uv;

            /*
             * STEP 2: Get input from the user using Scanner
             * - Ask for each variable above
             * - Validate numeric input using loops
             * - Example: Ensure highTemp >= lowTemp
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

            // daily temperature verification
            while (dailyHigh < dailyLow) {
                System.out.println("Invalid daily low and/or high temperature!!");
                System.out.println("Daily low needs to be lower than the high temperature");
                System.out.println("Please inform again... Daily high temperature:");
                dailyHigh = input.nextDouble();
                System.out.println("Daily low temperature:");
                dailyLow = input.nextDouble();
            }

            System.out.println("UV index:");
            uv = input.nextInt();
            // uv verification
            while (uv < 0 || uv > 12) {
                System.out.println("Invalid UV index!!");
                System.out.println("UV index must be between 0 and 11");
                System.out.println("Please enter a valid UV index:");
                uv = input.nextInt();
            }

            /*
             * STEP 3: Typecasting (if needed)
             * - Example: if you read a double but want to display as int
             */

            // TODO: Apply typecasting where necessary
            int dailyHighInt = (int) dailyHigh;
            int dailyLowInt = (int) dailyLow;

            /*
             * STEP 4: Conditional statements
             * - Example:
             * - If UV index >= 6, suggest "Use sunscreen"
             * - If precipitation >= 50%, suggest "Carry an umbrella"
             * - If wind speed > 40 km/h, suggest "Windy conditions"
             */

            // TODO: Write if, if-else, or nested if statements to display tips
            String uvSuggestion, precipitationSuggestion;

            // UV tips
            if (uv >= 0 && uv <= 2) {
                uvSuggestion = "UV level: Low";
            } else if (uv <= 5) {
                uvSuggestion = "UV level: Moderate";
            } else if (uv <= 7) {
                uvSuggestion = "UV level: High - Use sunscreen";
            } else if (uv <= 10) {
                uvSuggestion = "UV level: Very High - Use sunscreen";
            } else {
                uvSuggestion = "UV level: Extreme - Use sunscreen";
            }

            System.out.println(uvSuggestion);

            // Precipitation tips
            if (precipitation.equalsIgnoreCase("30%")) {
                precipitationSuggestion = "No rain expected today";
            } else if (precipitation.equalsIgnoreCase("60%")) {
                precipitationSuggestion = "Carry an umbrella";
            } else {
                precipitationSuggestion = "Rainy day ahead!!";
            }
            System.out.println(precipitationSuggestion);

            /*
             * STEP 5: Create a fullReport String
             * - Combine all user inputs and tips into one formatted sentence or paragraph
             * - Use String concatenation (+) or String.format()
             */

            // TODO: Construct your full weather report here
            String fullWeather = "Weather Report:\n" +
                    "Today's weather: " + weather + "\n" +
                    "Precipitation: " + precipitation + "\n" +
                    "Wind speed: " + windSpeed + "\n" +
                    "Temperature: " + dailyLowInt + "°C - " + dailyHighInt + "°C\n" +
                    "UV index: " + uv + "\n" +
                    uvSuggestion + precipitationSuggestion;

            /*
             * STEP 6: Print the full weather report
             */

            // TODO: Output your report using System.out.println()
            System.out.println("---Weather Full Report---");
            System.out.println(fullWeather);

            /*
             * STEP 7: Optional extra challenge
             * - Use loops to ask if the user wants to enter another day's report
             * - Continue until the user types "no"
             */
            System.out.println("Would you like to enter another day's report? 1-YES 2-NO");
            int dailyReport = input.nextInt();
            while (dailyReport != 1 && dailyReport != 2) {
                System.out.println("Number invalid... Would you like to enter another day's report? 1-YES 2-NO");
                dailyReport = input.nextInt();
            }

            if (dailyReport == 1) {
                answer = true;
            } else {
                answer = false;
            }

            // TODO: Implement loop for multiple reports

        } while (answer == true);
        input.close();

    }
}
