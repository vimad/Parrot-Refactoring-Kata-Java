package parrot;

public class AfricanParrot extends Parrot {

    public final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(voltage, isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
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
