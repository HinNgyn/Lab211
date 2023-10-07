import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User("Thanh Dat", "234567890");

        UserAccount userAccount = new UserAccount(user);

        userAccount.addTransaction(new Transaction(new Date(), 1000.0, "deposit"));
        userAccount.addTransaction(new Transaction(new Date(), 500.0, "deposit"));
        userAccount.addTransaction(new Transaction(new Date(), 200.0, "withdrawal"));
        userAccount.addTransaction(new Transaction(new Date(), 300.0, "withdrawal"));
        userAccount.addTransaction(new Transaction(new Date(), 1500.0, "deposit"));
        userAccount.addTransaction(new Transaction(new Date(), 700.0, "withdrawal"));
        userAccount.addTransaction(new Transaction(new Date(), 1200.0, "deposit"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTPBank Financial Transaction Analysis Menu:");
            System.out.println("1. Calculate Balance History");
            System.out.println("2. Find Min and Max Balances");
            System.out.println("3. Find Top Deposits and Withdrawals");
            System.out.println("4. Find Mean Transaction Amounts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance History:");
                    for (Double balance : userAccount.calculateBalanceHistory()) {
                        System.out.println(balance);
                    }
                    break;
                case 2:
                    double[] minMax = userAccount.findMinMaxBalance();
                    System.out.println("Min Balance: " + minMax[0]);
                    System.out.println("Max Balance: " + minMax[1]);
                    break;
                case 3:
                    TopTransactions topTransactions = userAccount.findTopDepositsAndWithdrawals();
                    System.out.println("Top Deposits:");
                    for (Transaction deposit : topTransactions.getTopDeposits()) {
                        System.out.println(deposit.getAmount());
                    }
                    System.out.println("Top Withdrawals:");
                    for (Transaction withdrawal : topTransactions.getTopWithdrawals()) {
                        System.out.println(withdrawal.getAmount());
                    }
                    break;
                case 4:
                    double[] meanTransaction = userAccount.findMeanTransaction();
                    System.out.println("Mean Deposit: " + meanTransaction[0]);
                    System.out.println("Mean Withdrawal: " + meanTransaction[1]);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
