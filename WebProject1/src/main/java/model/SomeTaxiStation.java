package model;

import model.entity.Automobile;
import model.comparator.AutomobileComparator;
import model.entity.Building;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Taxi station with building
 *
 * @author Anastasia Milinchuk
 */
public class SomeTaxiStation implements TaxiStation {
    /**
     * All automobiles which contain station
     */
    private List<Automobile> automobileList;

    /**
     * Building in station
     */
    private Building building;

    /**
     * Constructor for creating station. Building is expected
     *
     * @param building building
     */
    public SomeTaxiStation(Building building) {
        automobileList = new ArrayList<>();
        this.building = building;
    }

    @Override
    public double cost() {
        double cost = 0;
        for(Automobile automobile: automobileList){
            cost += automobile.getPrice();
        }
        cost += building.getCost();
        return cost;
    }

    @Override
    public void add(Automobile automobile) {
        automobileList.add(automobile);
    }

    @Override
    public void remove(int index) {
        automobileList.remove(index);
    }

    @Override
    public void sortAutomobiles() {
        automobileList.sort(new AutomobileComparator());
    }

    @Override
    public List<Automobile> findBySpeed(int start, int end) {
        return find(n -> ( (n >= start) && (n <= end) ));
    }

    @Override
    public String getStringAutomobiles() {
        return automobileList.toString();
    }

    @Override
    public List<Automobile> getAutomobilesList() {
        return automobileList;
    }

    private List<Automobile> find(Predicate<Integer> predicate){
        List<Automobile> findingAutomobiles = new ArrayList<>();

        for(Automobile automobile: automobileList){
            if(predicate.test(automobile.getMaxSpeed())){
                findingAutomobiles.add(automobile);
            }
        }

        return findingAutomobiles;
    }
}
