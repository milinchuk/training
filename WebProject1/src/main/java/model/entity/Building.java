package model.entity;

/**
 * Building
 *
 * @author Anastasia Milinchuk
 */
public class Building {
    /**
     * Size of building
     */
    private Size size;

    /**
     * Cost of building
     */
    private double cost;

    public Building() {
    }

    /**
     * Constructor with size and cost
     *
     * @param size size of building
     * @param cost cost
     */
    public Building(Size size, double cost) {
        this.size = size;
        this.cost = cost;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
