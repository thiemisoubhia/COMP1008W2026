package COMP1008W2026.Assignment01;

import java.util.ArrayList;
import java.util.Scanner;

// -------------------------
// LIBRARY MANAGER CLASS
// -------------------------
public class LibraryManager {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Book Management Menu ---");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display all available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:

                    break;
                case 2:
                   
                    break;
                case 3:
                
                    break;
                case 4:
                   
                    break;
                case 5:
                    
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

        
    }
}


