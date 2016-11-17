package model.entity;

/**
 * Created by click on 11/14/2016.
 */
public class Build {
    private Size size;
    private double cost;

    public Build() {
    }

    public Build(Size size, double cost) {
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
