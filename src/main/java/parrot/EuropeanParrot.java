package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(boolean isNailed) {
        super(isNailed);
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    public String getCry() {
        return "Sqoork!";
    }

}
