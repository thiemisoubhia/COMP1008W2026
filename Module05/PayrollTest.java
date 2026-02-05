import java.util.Scanner;

public class PayrollTest {

    public static void main(String[] args) {

        // TODO 9: Create a CommissionEmployee object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String empFirst = scanner.nextLine();

        System.out.println("Enter the last name: ");
        String empLast = scanner.nextLine();

        System.out.println("Enter the social security number: ");
        String empSocialNumber = scanner.nextLine();

        System.out.println("Enter the gross salary: ");
        double empGross = scanner.nextDouble();

        System.out.println("Enter the commision rate: ");
        double empCommission = scanner.nextDouble();

        CommissionEmployee emp = new CommissionEmployee(empFirst, empLast, empSocialNumber, empGross, empCommission);

       
    }
}