import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by tkanchanawanchai6403 on 4/3/2017.
 */
public abstract class Card {

    private String number;
    private Date exp;
    private int cvv;
    private String firstName;
    private String middleName;
    private String lastName;
    private BigDecimal balance;
    private String cardType;
    private boolean isSuspended;

    protected Card() {
        this.number = "1111 1111 1111 1111";
        this.exp = new Date();
        this.cvv = 111;
        this.firstName = "John";
        this.middleName = "";
        this.lastName = "Doe";
        this.balance = new BigDecimal(0.0);
        this.cardType = "";
        this.isSuspended = false;
    }

    public Card(String number, Date exp, int cvv, String firstName, String middleName, String lastName, BigDecimal balance, String cardType) {
        this.number = number;
        this.exp = exp;
        this.cvv = cvv;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.balance = balance;
        this.cardType = cardType;
        this.isSuspended = false;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        this.isSuspended = suspended;
    }

    /**
     * charge verifies if the card is authorized.
     * @return the status after verification and authorization
     */
    public abstract boolean charge(BigDecimal amount);

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
