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

        // using do while to execute the first one... and them chequing to execute while
        // the option is not 7
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

            // switch case for menu options
            switch (choice) {
                case 1:
                    addBook(books, sc);
                    break;
                case 2:
                    displayBooks(books);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    break;
                //exit the program
                case 7:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

    }

    // 1.add a new book
    public static void addBook(ArrayList<Book> books, Scanner sc) {
        Book newBook = new Book();

        System.out.print("Insert the title: ");
        newBook.setTitle(sc.nextLine());

        System.out.print("Insert the author: ");
        newBook.setAuthor(sc.nextLine());

        System.out.print("Insert the ISBN: ");
        newBook.setIsbn(sc.nextLine());

        System.out.print("The book is available? 1-YES 2-NO");
        String check = sc.nextLine();

        // verifying 1 for TRUE and 2 for FALSE
        while (Integer.parseInt(check) != 1 && Integer.parseInt(check) != 2) {
            if (Integer.parseInt(check) == 1) {
                newBook.setAvailable(true);
            } else if (Integer.parseInt(check) == 2) {
                newBook.setAvailable(false);
            } else {
                System.out.println("Wrong option... Please type 1-Available 2-Not available");
                check = sc.nextLine();
            }
        }
        // add the book to the array list
        books.add(newBook);

    }

    // 2. display all books
    public static void displayBooks(ArrayList<Book> books) {

        System.out.println("\n--- All Books ---");

        for (Book b : books) {
            b.displayInfo();
        }

    }

    // 3. display available books

    // 4. search books by author

    // 5. check out a book

    // 6. return a book
}
