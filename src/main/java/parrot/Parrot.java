package parrot;

public abstract class Parrot {

    public final double voltage;
    public final boolean isNailed;

    public Parrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(voltage, isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts,voltage, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }

    public abstract double getSpeed();
    public abstract String getCry();

    public double getBaseSpeed() {
        return 12.0;
    }

}
