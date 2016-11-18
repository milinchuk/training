package model.comparator;

import model.entity.Automobile;

import java.util.Comparator;

/**
 * This is comparator for Automobile
 *
 * @author Anastasia Milinchuk
 */
public class AutomobileComparator implements Comparator<Automobile> {
    @Override
    public int compare(Automobile o1, Automobile o2) {
        return o1.compareTo(o2);
    }
}
