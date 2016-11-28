package observer;

/**
 * Created by click on 11/28/2016.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
