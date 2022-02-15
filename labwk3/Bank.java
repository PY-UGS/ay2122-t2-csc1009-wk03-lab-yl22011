import java.util.Scanner;
import java.util.Date;

public class Bank {

    public static void main(String[] args){

        Date date = new Date();

        Loan loan = new Loan();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        loan.setAnnualInterestRate(obj.nextDouble());
        System.out.println("Enter number of years as an integer: ");
        loan.setNumberOfYears(obj.nextInt());
        System.out.println("Enter loan amount, for example, 120000.95: ");
        loan.setLoanAmount(obj.nextDouble());
        loan.setLoanDate(date);

        double monthly = loan.getMonthlyPayment();
        double total = loan.getTotalPayment(monthly);

        System.out.println("The loan was created on " + loan.getLoanDate().toString());
        System.out.printf("The monthly payment is %.2f \n", monthly);
        System.out.printf("The total payment is %.2f \n", total);

        

    }
    
}
