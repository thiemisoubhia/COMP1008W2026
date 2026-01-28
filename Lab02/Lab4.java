package COMP1008W2026.Lab02;
// Use this as your starting template.

// Lines beginning with 
// // are comments — feel free to keep them.

//Thiemi Soubhia Doi - 200645138

import java.util.ArrayList;
import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {

        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists

        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
                // TODO: Fill in your grocery items
                "Pasta", "Apples", "Chocolates", "Lettuce", "Cookies", "Carrots"
        };

        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        System.out.println(Arrays.toString(groceries));

        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();

        // TODO: Loop through the array and add items to groceryList
        for (int i = 0; i < groceries.length; i++) {
            groceryList.add(groceries[i]);
        }

        // print the list
        System.out.println("Grocery List");
        for(String i : groceryList){
            System.out.println("*"+i);
        }

        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        // add
        groceryList.add("Bread");
        groceryList.add("Soda");

        // remove carrot
        groceryList.remove(5);

        // print the update list
        System.out.println("The update Grocery List");
        for (String i : groceryList) {
            System.out.println("*" + i);
        }

        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================

        // variable to count the vowels
        int vowels = 0;

        for (String i : groceryList) {
            // A
            if (i.toLowerCase().startsWith("a")) {
                vowels++;
            }

            // E
            if (i.toLowerCase().startsWith("e")) {
                vowels++;
            }

            // I
            if (i.toLowerCase().startsWith("i")) {
                vowels++;
            }

            // O
            if (i.toLowerCase().startsWith("o")) {
                vowels++;
            }

            // U
            if (i.toLowerCase().startsWith("u")) {
                vowels++;
            }
        }

        // ================================================
        // STEP 6: Print the final results
        // ================================================
        System.out.println("Quantity of itens that start with a vowel: " + vowels);
    }
}
