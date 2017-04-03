import java.math.BigDecimal;

/**
 * Created by tkanchanawanchai6403 on 4/3/2017.
 */
public class CreditCard extends Card {
    private BigDecimal creditLimit;

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * charge is authorized based on the following rules:
     * 1. credit limit
     * 2. suspended
     *
     *
     * @param amount
     * @return true if credit limit is greater than the current balance plus current amount and the card is not suspended.
     */
    @Override
    public boolean charge(BigDecimal amount) {
        boolean status=(getCreditLimit().compareTo(amount.add(getBalance()))>0) && !isSuspended();
        return status;
    }
}
