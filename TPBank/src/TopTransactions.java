import java.util.List;

public class TopTransactions {
    private List<Transaction> topDeposits;
    private List<Transaction> topWithdrawals;

    public TopTransactions(List<Transaction> topDeposits, List<Transaction> topWithdrawals) {
        this.topDeposits = topDeposits;
        this.topWithdrawals = topWithdrawals;
    }

    public List<Transaction> getTopDeposits() {
        return topDeposits;
    }

    public List<Transaction> getTopWithdrawals() {
        return topWithdrawals;
    }
}
