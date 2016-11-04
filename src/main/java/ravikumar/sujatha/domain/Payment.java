package ravikumar.sujatha.domain;

/**
 * Created by sujatharavikumar on 11/2/16.
 */
public class Payment {

    private String username;
    private Short amount;

    public Payment (String username, Short amount) {
        this.username = username;
        this.amount = amount;
    }

    public Payment () {}

    public void setId(String username) {
        this.username = username;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public String getUsername() {

        return username;
    }

    public Short getAmount() {
        return amount;
    }
}
