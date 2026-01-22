package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    public String getCry() {
        return "Sqoork!";
    }

}
