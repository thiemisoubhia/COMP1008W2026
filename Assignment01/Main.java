package COMP1008W2026.Assignment01;

//Thiemi Soubhia Doi - 200645138

// -------------------------
// BOOK CLASS
// -------------------------
class Book {
    // Instance variables (private for encapsulation)
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    /**
     * Constructor to initialize Book object
     * 
     * @param title Book's name and @param author Author's name cannot be empty
     * @param isbn  must follow a simple pattern (e.g., 10 or 13 characters)
     */

    // Default constructor
    public Book() {
        this.title = "Title";
        this.author = "Author";
        this.isbn = "0000000000";
        this.available = true;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn) {

        if (author == null || title == null) {
            System.out.println("Title and author parameters cannot be empty");
        } else {
            this.title = title;
            this.author = author;
        }

        if (isbn == null || !(isbn.length() >= 10 || isbn.length() <= 13)) {
            System.out.println("ISBN must follow a simple pattern (e.g., 10 or 13 characters)");
        } else {
            this.isbn = isbn;
        }

        this.available = true;
    }

    // setters
    public void setTitle(String title) {
        if (title == null) {
            System.out.println("Title parameter cannot be empty");
        } else {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author == null) {
            System.out.println("Author parameter cannot be empty");
        } else {
            this.author = author;
        }
    }

    public void setIsbn(String isbn) {
         if (isbn == null || !(isbn.length() >= 10 || isbn.length() <= 13)) {
            System.out.println();
        } else {
            this.isbn = isbn;
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

}

// -------------------------
// MAIN CLASS
// -------------------------
public class Main {

}
