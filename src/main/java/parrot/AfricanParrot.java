package parrot;

public class AfricanParrot extends Parrot {

    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    public String getCry() {
        return "Sqaark!";
    }

    public double getLoadFactor() {
        return 9.0;
    }
}
