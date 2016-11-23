package model.comparator;

import model.entity.Automobile;

import java.util.Comparator;

/**
 * This is comparator for Automobile
 *
 * @author Anastasia Milinchuk
 */
public class AutomobileComparator implements Comparator<Automobile> {
    /**
     * Compare two automobiles
     * @param o1 first automobile
     * @param o2 second automobile
     *
     * @return -1 if o1 < o2, 0 if o1 == o2, 1 if o1 > o2
     */
    @Override
    public int compare(Automobile o1, Automobile o2) {
        return o1.compareTo(o2);
    }
}
