package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    public String getCry() {
        return "Sqoork!";
    }

}
