import java.util.LinkedList;
import java.util.List;

public class UserAccount {

    private User user;
    private LinkedList<Transaction> transactions;

    public UserAccount(User user) {
        this.user = user;
        this.transactions = new LinkedList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Double> calculateBalanceHistory() {
        List<Double> balanceHistory = new LinkedList<>();
        double currentBalance = user.getBalance();

        for (Transaction transaction : transactions) {
            if (transaction.getType().equals("deposit")) {
                currentBalance += transaction.getAmount();
            } else if (transaction.getType().equals("withdrawal")) {
                currentBalance -= transaction.getAmount();
            }
            balanceHistory.add(currentBalance);
        }
        return balanceHistory;
    }
    

    public double[] findMeanTransaction() {
        double totalDepositAmount = 0;
        double totalWithdrawalAmount = 0;
        int depositCount = 0;
        int withdrawalCount = 0;

        for (Transaction transaction : transactions) {
            if (transaction.getType().equals("deposit")) {
                totalDepositAmount += transaction.getAmount();
                depositCount++;
            } else if (transaction.getType().equals("withdrawal")) {
                totalWithdrawalAmount += transaction.getAmount();
                withdrawalCount++;
            }
        }

        double meanDeposit = depositCount > 0 ? totalDepositAmount / depositCount : 0;
        double meanWithdrawal = withdrawalCount > 0 ? totalWithdrawalAmount / withdrawalCount : 0;

        return new double[]{meanDeposit, meanWithdrawal};
    }
    public double[] findMinMaxBalance() {
        List<Double> balanceHistory = calculateBalanceHistory();
        double minBalance = Double.MAX_VALUE;
        double maxBalance = Double.MIN_VALUE;

        for (Double balance : balanceHistory) {
            minBalance = Math.min(minBalance, balance);
            maxBalance = Math.max(maxBalance, balance);
        }

        return new double[]{minBalance, maxBalance};
    }


public TopTransactions findTopDepositsAndWithdrawals() {
        LinkedList<Transaction> topDeposits = new LinkedList<>();
        LinkedList<Transaction> topWithdrawals = new LinkedList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getType().equals("deposit")) {
                topDeposits.add(transaction);
            } else if (transaction.getType().equals("withdrawal")) {
                topWithdrawals.add(transaction);
            }
        }

        topDeposits.sort((t1, t2) -> Double.compare(t2.getAmount(), t1.getAmount()));
        topWithdrawals.sort((t1, t2) -> Double.compare(t2.getAmount(), t1.getAmount()));

        return new TopTransactions(
                topDeposits.subList(0, Math.min(3, topDeposits.size())),
                topWithdrawals.subList(0, Math.min(3, topWithdrawals.size()))
        );
}
}
