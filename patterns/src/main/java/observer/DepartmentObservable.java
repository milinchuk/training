package observer;

import strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 11/28/2016.
 */
public class DepartmentObservable implements Observable{
    private List<Observer> observers;
    private String sheldue;

    public DepartmentObservable() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.handleEvent(sheldue);
        }
    }

    public void changeSessionSheldue(){
        sheldue = "change";
        notifyObservers();
    }
}
