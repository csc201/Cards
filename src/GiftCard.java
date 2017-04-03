import java.math.BigDecimal;

/**
 * Created by tkanchanawanchai6403 on 4/3/2017.
 */
public class GiftCard extends Card {
    /**
     * charge is authorized based on the following rules:
     * 1. current balance
     * 2. suspended
     *
     * @param amount
     * @return true if the current balance is greater than the amount and the card is not suspended.
     */
    @Override
    public boolean charge(BigDecimal amount) {
        boolean status = ((getBalance().subtract(amount)).doubleValue()>0) && !isSuspended();
        return status;
    }
}
