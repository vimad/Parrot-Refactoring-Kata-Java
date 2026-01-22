package parrot;

public class NorwegianBlueParrot extends Parrot {

    public final double voltage;
    public final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    public double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

}
