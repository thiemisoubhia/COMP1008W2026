package COMP1008W2026.Assignment01;

import java.util.ArrayList;
import java.util.Collections;
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
                    availableBooks(books);
                    break;
                case 4:
                    searchBooks(books, sc);
                    break;
                case 5:
                    checkoutBook(books, sc);
                    break;
                case 6:
                    checkinBook(books, sc);
                    break;
                // exit the program
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

        System.out.print("The book is available? 1-YES 2-NO ");
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
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        System.out.println("\n--- All Books ---");

        int availableCount = 0;
        int checkedOutCount = 0;

        for (Book b : books) {
            b.displayInfo();

            if (b.isAvailable()) {
                availableCount++;
            } else {
                checkedOutCount++;
            }
        }

        System.out.println("\nSummary:");
        System.out.println("Available books: " + availableCount);
        System.out.println("Checked-out books: " + checkedOutCount);

    }

    // 3. display available books
    public static void availableBooks(ArrayList<Book> books) {
        System.out.println("---Books Available---");
        for (Book b : books) {
            if (b.isAvailable() == true) {
                System.out.print("*");
                b.displayInfo();
            }
        }
    }

    // 4. search books by author
    public static void searchBooks(ArrayList<Book> books, Scanner sc) {
        System.out.println("---Search Books---");
        System.out.println("Please type the name of the author:");
        String nameAuthor = sc.nextLine();

        ArrayList<Book> bookFound = new ArrayList<>();

        // for to check all the indexes
        for (Book b : books) {
            if (nameAuthor.equalsIgnoreCase(b.getAuthor())) {
                bookFound.add(b);
                b.displayInfo();
            }
        }

        if (bookFound.isEmpty()) {
            System.out.println("Books not found!!");
        }
    }

    // 5. check out a book
    public static void checkoutBook(ArrayList<Book> books, Scanner sc) {
        System.out.println("Please select which information is going to be provided to return the book: ");
        System.out.println("1. Title");
        System.out.println("2. Author");
        System.out.println("3. ISBN");

        String search = sc.nextLine();
        boolean found = false;

        do {
            switch (Integer.parseInt(search)) {
                case 1:
                    System.out.println("Please inform the TITLE:");
                    String title = sc.nextLine();

                    for (Book b : books) {
                        if (title.equalsIgnoreCase(b.getTitle())) {
                            found = true;
                            if (b.isAvailable()) {
                                b.setAvailable(false);
                                System.out.println("Book checked out successfully!");
                                break;
                            } else {
                                System.out.println("This book is already checked out.");
                                break;
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("Please inform the AUTHOR:");
                    String author = sc.nextLine();

                    for (Book b : books) {
                        if (author.equalsIgnoreCase(b.getAuthor())) {
                            found = true;
                            if (b.isAvailable()) {
                                b.setAvailable(false);
                                System.out.println("Book checked out successfully!");
                                break;
                            } else {
                                System.out.println("This book is already checked out.");
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Please inform the ISBN:");
                    String isbn = sc.nextLine();

                    for (Book b : books) {
                        if (isbn.equalsIgnoreCase(b.getIsbn())) {
                            found = true;

                            if (b.isAvailable()) {
                                b.setAvailable(false);
                                System.out.println("Book checked out successfully!");
                                break;
                            } else {
                                System.out.println("This book is already checked out.");
                                break;
                            }
                        }
                    }
                    break;

                default:
                    System.out.println(
                            "Invalid option... Please select which information is going to be provided to return the book:");
                    System.out.println("1. Title");
                    System.out.println("2. Author");
                    System.out.println("3. ISBN");

                    search = sc.nextLine();

            }
        } while (Integer.parseInt(search) != 1 && Integer.parseInt(search) != 2 && Integer.parseInt(search) != 3);

    }

    // 6. return a book
    public static void checkinBook(ArrayList<Book> books, Scanner sc) {

        System.out.println("Please inform the ISBN of the book to return:");
        String isbn = sc.nextLine();

        boolean found = false;

        for (Book b : books) {
            if (isbn.equalsIgnoreCase(b.getIsbn())) {
                found = true;

                if (!b.isAvailable()) {
                    b.setAvailable(true);
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not checked out.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

}
