package model.comparator;

import model.entity.Automobile;

import java.util.Comparator;

/**
 * Created by click on 11/14/2016.
 */
public class AutomobileComparator implements Comparator<Automobile> {
    @Override
    public int compare(Automobile o1, Automobile o2) {
        return o1.compareTo(o2);
    }
}
