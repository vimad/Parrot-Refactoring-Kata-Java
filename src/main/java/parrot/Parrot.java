package parrot;

public abstract class Parrot {

    public final ParrotTypeEnum type;
    public final int numberOfCoconuts;
    public final double voltage;
    public final boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(ParrotTypeEnum.EUROPEAN, numberOfCoconuts,voltage, isNailed);
            case AFRICAN -> new AfricanParrot(ParrotTypeEnum.AFRICAN, numberOfCoconuts,voltage, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts,voltage, isNailed);
        };
    }

    public abstract double getSpeed();
    public abstract String getCry();

    public double getBaseSpeed() {
        return 12.0;
    }

}
