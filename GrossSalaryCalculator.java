import java.util.Scanner; // for user to input

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in); // Scanner object
                                            // ---- Scanner object has to e outside of the loop

        do {
            System.out.print("Your Annual Salary			: "); // Asking user to input its annual salary
            float totalSalary = i.nextFloat(); // salary input
            double tax_deduction = 0; // Tax_deduction variable

            if (totalSalary < 250000) { // if - else if - else statement
                float Monthly_Rate = totalSalary / 12;
                float Daily_Rate = Monthly_Rate / 22; // since annual salary less than 250000
                float Hourly_Rate = Daily_Rate / 8; // has no tax deduction, I separate its
                float Net_Pay = Monthly_Rate; // formula

                System.out.println("Your Monthly Rate			: " + String.format("%.2f", Monthly_Rate));
                System.out.println("Your Daily Rate				: " + String.format("%.2f", Daily_Rate)); // to output
                System.out.println("Your Hourly Rate			: " + String.format("%.2f", Hourly_Rate));
                System.out.println("Your Annual Tax Deduction	: 0 ");
                System.out.println("Monthly Tax Deduction 		: 0");
                System.out.println("Net Pay						: " + String.format("%.2f", Net_Pay));

            } else if (totalSalary >= 250000 && totalSalary < 400000) {
                tax_deduction = totalSalary - 150000 * 0.20;
            } else if (totalSalary >= 400000 && totalSalary < 800000) {
                float tax_excess = totalSalary - 400000;
                tax_deduction = 0.25 * tax_excess + 30000;
            } else if (totalSalary >= 800000 && totalSalary < 2000000) {
                float tax_excess = totalSalary - 1800000;
                tax_deduction = 0.30 * tax_excess + 130000;
            } else if (totalSalary >= 2000000 && totalSalary < 8000000) {
                float tax_excess = totalSalary - 6000000;
                tax_deduction = 0.32 * tax_excess + 490000;
            } else {
                float tax_excess = totalSalary - 8000000;
                tax_deduction = 0.35 * tax_excess + 2410000;
            }

            float Monthly_Rate = totalSalary / 12;
            float Daily_Rate = Monthly_Rate / 22; // formula of annual salary greater than 250000
            float Hourly_Rate = Daily_Rate / 8;
            double Annual_Tax_Deduction = tax_deduction;
            double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate			: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate				: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate			: " + String.format("%.2f", Hourly_Rate)); // to output the
                                                                                                       // data
            System.out.println("Your Annual Tax Deduction		: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction			: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay					: " + String.format("%.2f", Net_Pay));
            System.out.println("Continue? Then type yes otherwise type anything. ");

            String continueOK = i.next();
            // take a string using .next()
            // yes or something else
            if (continueOK.equalsIgnoreCase("yes")) {
                // compare the string(The var continueOk) to "yes"
                i.reset(); // reset the scanner
            } else {
                break;
                // -- break to loop
            }
        } while (true);
        // while -loop will always looping since the condition never changes.
        System.out.println("Goodbye!");
        i.close(); // to close the scanner
    }
}