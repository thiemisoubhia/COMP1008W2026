import java.util.Scanner;
 
 
/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/
 
 
// ACCOUNT CLASS
 
class Account {
    // Instance variables (private for encapsulation)
    private String name;
    private double balance;

    // Constant: minimum balance
    private static final double MIN_Balance = 0.0;
     
    /**
     * Constructor to initialize Account object
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
   
    Account(String name, double balance){
        this.name = name;
        if(balance >= MIN_Balance){
            this.balance = balance;
        } else{
            balance = MIN_Balance;
        }
    }

    
    // Set Methods (Mutators)
    //changing private variables safety
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        if(balance >= MIN_Balance){
            this.balance = balance;
        }
    }

    // Get Methods (Accessors)
    //reading this private variables safety
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
    // Display Info
    //void - method without any return
    void displayInfo(){
        System.out.println("Acount Name: " + name);
        System.out.println("Acount Balance: $" + balance);
    }

    // Method with parameter and return
    double deposit(double amount){
        if (amount>0) {
            balance += amount;
        }
        return balance;
    }
}
 
// ABSTRACT CLASS EXAMPLE
 
abstract class AccountBase {
    // abstract method
    abstract double calculateInterest();

 //normal method
 void displayType(){
    System.out.println("This is a base account type");
 }

    
}
 
 
class SavingsAccount extends AccountBase {
    private double balance;
    private double rate;

    SavingsAccount(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }

    //Reusing the parent method with our definition instead
    @Override
    double calculateInterest(){
        return balance * rate;
    }
}
 
 
// INTERFACE EXAMPLE
/*An interface is a blueprint in Java that defines abstract methods (methods without implementation) that a class must implement.
Interfaces cannot have instance variables, only constants, but can have default methods with implementation (Java 8+).
A class uses the implements keyword to provide concrete behavior for all interface methods.
Interfaces allow polymorphism and multiple inheritance of type, letting a class implement multiple interfaces. */
 
interface Printable {
    void print();
}
 
 
class AccountReport implements Printable {
    private Account account;
 
 
    AccountReport(Account account) {
        this.account = account;
    }
 
 
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}
 
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
 
       Scanner input = new Scanner(System.in);
        // 1. Creating Account Objects
        Account acc1 = new Account("Thiemi", 100);
        Account acc2 = new Account("Alice", 200);

        // 2. Using Set/Get Methods
        acc2.setName("Shivi");
        System.out.println(acc2.getName());

        // 3. Primitive vs Reference Types
        //reference copy
        Account acc3 = acc1;
        acc3.setBalance(500);

        // 4. Constants
        System.out.println("\nMinimum balance constant: $" + 0.0);
      
        // 5. Methods with Parameters & Return Values
        double newBalance = acc2.deposit(1000);
        System.out.println("acc2 new balance = $" + newBalance);
    
        // 6. Abstract Class
        SavingsAccount sa = new SavingsAccount(1200, 0.05);
        sa.displayType();
        System.out.println("Ineterest for savings account = $" + sa.calculateInterest());

        // 7. Interface
        AccountReport report = new AccountReport(acc1);
        report.print();
        
        // 8. Scanner Example (Optional User Input)
       System.err.println("Enter new name for acc2");
       String newName = input.nextLine();
       acc2.setName(newName);
       acc2.displayInfo();
       input.close();
    }
    
}