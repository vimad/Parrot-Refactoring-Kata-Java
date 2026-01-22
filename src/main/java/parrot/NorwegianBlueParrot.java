package parrot;

public class NorwegianBlueParrot extends Parrot {

    public NorwegianBlueParrot(ParrotTypeEnum parrotTypeEnum, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
