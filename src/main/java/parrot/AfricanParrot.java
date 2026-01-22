package parrot;

public class AfricanParrot extends Parrot {

    public AfricanParrot(ParrotTypeEnum parrotTypeEnum, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    public String getCry() {
        return "Sqaark!";
    }

}
