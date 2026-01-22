package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(ParrotTypeEnum parrotTypeEnum, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.EUROPEAN, numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    public String getCry() {
        return "Sqoork!";
    }

}
