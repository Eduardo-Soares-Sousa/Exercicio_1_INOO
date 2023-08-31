package ProjectUSMoney;

public class USMoney{

    private int dollars;
    private int cents;

    public USMoney(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;

        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents %= 100;
        }
    }

    public USMoney plus(USMoney other) {
        int newDollars = this.dollars + other.dollars;
        int newCents = this.cents + other.cents;

        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents %= 100;
        }

        return new USMoney(newDollars, newCents);
    }

    @Override
    public String toString() {
        return dollars + " dollars and " + cents + " cents";
    }
}