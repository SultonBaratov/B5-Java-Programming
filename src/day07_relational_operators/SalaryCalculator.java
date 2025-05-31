package day07_relational_operators;
/*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100000;
        double stateTaxRate = 0.02; // %2
        double federalTaxRate = 0.22; // %22

        double stateTaxAmaount, federalTaxAmaout, totalTaxAmount, salaryAfterTax;
        stateTaxAmaount = salary * stateTaxRate;
        federalTaxAmaout = salary * federalTaxRate;

        totalTaxAmount = stateTaxAmaount + federalTaxAmaout;
        salaryAfterTax = salary - totalTaxAmount;
        String taxReport = "Tax Info:  \n\tBase Salary:\t\t$"+salary+"\n\tSat Tax Rate:\t\t" + stateTaxRate+"\n\tFederal Tax rate:\t"+federalTaxRate;


        System.out.println(taxReport);

    }
}
