package parrot;

public abstract class Parrot {

    public final boolean isNailed;

    public Parrot(boolean isNailed) {
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }

    public abstract double getSpeed();
    public abstract String getCry();

    public double getBaseSpeed() {
        return 12.0;
    }

}
