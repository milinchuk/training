package model.entity;

/**
 * This is Automobile entity
 *
 * @author Anastasia Milinchuk
 */
public class Automobile implements Comparable<Automobile> {
    /*
     * Text constants
     */
    public static final String MARK = "\n\tMark: ";
    public static final String TYPE = "\n\ttype: ";
    public static final String MODEL = "\n\tmodel: ";
    public static final String ENGINE_VOLUME = "\n\tengine volume: ";
    public static final String PRICE = "\n\tprice: ";
    public static final String MAX_SPEED = "\n\tmax speed: ";

    /**
     * Mark of automobile
     */
    private String mark;

    /**
     * Type of automobile
     */
    private String type;

    /**
     * Model
     */
    private String model;

    /**
     * Engine volume in liter
     */
    private double engineVolume;

    /**
     * Price in dollars
     */
    private double price;

    /**
     * Max speed in kilometers
     */
    private int maxSpeed;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Compare for Automobile by engine volume
     *
     * @param o Automobile
     * @return positive value, negative value, zero
     */
    @Override
    public int compareTo(Automobile o) {
        return ((Double)engineVolume).compareTo(o.engineVolume);
    }

    /**
     * Automobile in string
     *
     * @return string
     */
    @Override
    public String toString(){
        return MARK + mark + TYPE + type + MODEL + model +
                ENGINE_VOLUME + engineVolume + PRICE + price + MAX_SPEED + maxSpeed + "\n";
    }
}
