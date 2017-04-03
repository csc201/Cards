import java.math.BigDecimal;

/**
 * Created by tkanchanawanchai6403 on 4/3/2017.
 */
public class DebitCard extends CreditCard {
    private short pin;

    /**
     * charge is authorized based on the following rules:
     * 1. current balance
     * 2. suspended
     * 3. PIN must be valid
     *
     * @param amount
     * @return true if the current balance is greater than the amount and the card is not suspended and the PIN is valid.
     */

    public boolean charge(BigDecimal amount, short pin) {
        boolean status = ((getBalance().subtract(amount)).doubleValue()>0) && !isSuspended() && getPin()==pin;
        return status;
    }

    public short getPin() {
        return pin;
    }

    public void setPin(short pin) {
        this.pin = pin;
    }
}
