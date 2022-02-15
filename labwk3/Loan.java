import java.util.Date;
import java.lang.Math;

public class Loan{

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Date getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){

        double MonthlyPayment = (this.loanAmount * (annualInterestRate/100)/12)/(1- (1/Math.pow((1+((annualInterestRate/100)/12)),numberOfYears*12)));
        return MonthlyPayment;

    }

    public double getTotalPayment(double monthlypayment){

        double totalPayment = monthlypayment * this.numberOfYears * 12;
        return totalPayment;

    }



}