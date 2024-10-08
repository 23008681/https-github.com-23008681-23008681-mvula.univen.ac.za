
package budget_plan_system;

import java.util.Scanner;

// Superclass Finance
class Finance {

    // Method to calculate total expenses
    public double calculateExpenses(double[] expenses) {
        double total = 0;
        for (double expense : expenses) {
            total += expense;
        }
        return total;
    }

    // Method to calculate vehicle loan monthly repayment
    public double calculateVehicleLoan(double purchasePrice, double totalDeposit, double interestRate) {
        double loanAmount = purchasePrice - totalDeposit;
        double monthlyInterestRate = interestRate / 100 / 12;
        int loanTermMonths = 5 * 12; // 5-year loan term

        double monthlyLoanRepayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        return monthlyLoanRepayment;
    }
}

// Subclass Budget_Plan_System extending Finance
public class Budget_Plan_System extends Finance {

    public static void main(String[] args) {
        Budget_Plan_System budgetPlan = new Budget_Plan_System(); // Create an instance of Budget_Plan_System

        Scanner Amount = new Scanner(System.in);
        System.out.print("ENTER YOUR GROSS MONTHLY INCOME (before deductions): ");
        double grossIncome = Amount.nextDouble();

        System.out.print("ENTER YOUR ESTIMATED TAX (PERCENTAGE): ");
        double taxPercentage = Amount.nextDouble();

        System.out.print("ENTER YOUR MONTHLY GROCERY EXPENSE: ");
        double groceries = Amount.nextDouble();

        System.out.print("Enter your estimated monthly expenses on water and lights: ");
        double waterAndLights = Amount.nextDouble();

        System.out.print("Enter your estimated monthly travel costs (including petrol): ");
        double travelCosts = Amount.nextDouble();

        System.out.print("Enter your estimated monthly expenses on cell phone and telephone: ");
        double cellPhone = Amount.nextDouble();

        System.out.print("Enter your estimated other monthly expenses: ");
        double otherExpenses = Amount.nextDouble();

        // Total expenditure calculation
        double[] expenditures = {groceries, waterAndLights, travelCosts, cellPhone, otherExpenses};
        double totalExpenditures = budgetPlan.calculateExpenses(expenditures);

        // Accommodation choice
        System.out.print("Is your choice to rent accommodation or buy a property? (rent/buy): ");
        String accommodationChoice = Amount.next();

        double accommodationCost;
        if (accommodationChoice.equalsIgnoreCase("rent")) {
            System.out.print("Enter your monthly rental amount: ");
            accommodationCost = Amount.nextDouble();
        } else if (accommodationChoice.equalsIgnoreCase("buy")) {
            System.out.print("Enter the purchase price of the property: ");
            double purchasePrice = Amount.nextDouble();

            System.out.print("Enter the total deposit: ");
            double deposit = Amount.nextDouble();

            System.out.print("Enter the interest rate (percentage): ");
            double interestRate = Amount.nextDouble();

            System.out.print("Enter the number of months to repay (between 240 and 360): ");
            int repaymentMonths = Amount.nextInt();

            if (repaymentMonths < 240 || repaymentMonths > 360) {
                System.out.println("INVALID CHOICE.");
                return;
            }

            double loanAmount = purchasePrice - deposit;
            double monthlyInterestRate = interestRate / 100 / 12;
            double monthlyRepayment = (loanAmount * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -repaymentMonths));

            accommodationCost = monthlyRepayment;

            // Check if the monthly home loan repayment exceeds one-third of gross income
            if (accommodationCost > grossIncome / 3) {
                System.out.println("You request is granted ");
            }
        } else {
            System.out.println("Sorry!!! You do not qualify");
            return;
        }

        // Tax calculations
        double tax = grossIncome * taxPercentage / 100;
        double netMonthlyIncome = grossIncome - tax - totalExpenditures - accommodationCost;

        // Display results
        System.out.println("Gross Monthly Income: " + grossIncome);
        System.out.println("Estimated Monthly Tax Deducted: " + tax);
        System.out.println("Total Monthly Expenditures: " + totalExpenditures);
        System.out.println("Accommodation Cost: " + accommodationCost);
        System.out.println("Net Monthly Income: " + netMonthlyIncome);

        // Vehicle purchase decision
        Amount.nextLine(); // Clear buffer
        System.out.println("Would you like to buy a car? (yes/no)");
        String response = Amount.nextLine();
        double totalMonthlyCost = 0;

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter your gross monthly income (before deductions): ");
            double model = Amount.nextDouble();

            System.out.print("Enter your purchase price: ");
            double purchasePrice = Amount.nextDouble();

            System.out.print("Enter your total deposit: ");
            double totalDeposit = Amount.nextDouble();

            System.out.print("Enter your estimated monthly interest rate: ");
            double interestRate = Amount.nextDouble();

            System.out.print("Enter your estimated insurance premium: ");
            double insurance = Amount.nextDouble();

            totalMonthlyCost = budgetPlan.calculateVehicleLoan(purchasePrice, totalDeposit, interestRate) + insurance;
        } else {
            System.out.println("You selected the option of not buying a car.");
        }

        double[] totalExpensesArray = {netMonthlyIncome, totalMonthlyCost};
        double totalExpenses = budgetPlan.calculateExpenses(totalExpensesArray);
        double remainingIncome = netMonthlyIncome - totalExpenses;

        // Step 5: Validate Expenses
        if (totalExpenses > 0.75 * netMonthlyIncome) {
            System.out.println("Warning: Your expenses exceed 75% of your income.");
        }

        // Display final results
        System.out.println("Your net monthly income after tax: " + netMonthlyIncome);
        System.out.println("Your total monthly expenses: " + totalExpenses);
        System.out.println("Remaining monthly income: " + remainingIncome);

        if (remainingIncome < 0) {
            System.out.println("You are now running an overdraft.");
        } else if (remainingIncome > 0) {
            System.out.println("You can now consider buying a car.");
        }

       
    }
}