package parrot;

public abstract class Parrot {

    public abstract double getSpeed();
    public abstract String getCry();

    public double getBaseSpeed() {
        return 12.0;
    }

}
