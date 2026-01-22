package parrot;

public class NorwegianBlueParrot extends Parrot {

    public NorwegianBlueParrot(ParrotTypeEnum parrotTypeEnum, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
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
