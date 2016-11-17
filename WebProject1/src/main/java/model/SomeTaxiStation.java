package model;

import model.entity.Automobile;
import model.comparator.AutomobileComparator;
import model.entity.Build;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by click on 11/14/2016.
 */
public class SomeTaxiStation implements TaxiStation {
    private List<Automobile> automobileList;
    private Build build;

    public SomeTaxiStation() {
        automobileList = new ArrayList<>();
        build = new Build();
    }

    public List<Automobile> getAutomobileList() {
        return automobileList;
    }

    public void setAutomobileList(List<Automobile> automobileList) {
        this.automobileList = automobileList;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    @Override
    public double cost() {
        double cost = 0;
        for(Automobile automobile: automobileList){
            cost += automobile.getPrice();
        }
        cost += build.getCost();
        return cost;
    }

    @Override
    public void sortAutomobiles() {
        automobileList.sort(new AutomobileComparator());
    }

    @Override
    public List<Automobile> findBySpeed(int start, int end) {
        return find(n -> ( (n >= start) && (n <= end) ));
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
