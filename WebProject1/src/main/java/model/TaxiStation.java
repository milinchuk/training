package model;

import model.entity.Automobile;

import java.util.List;

/**
 * Taxi station interface
 *
 * @author Anastasia Milinchuk
 */
public interface TaxiStation {
    /**
     * Cost of taxi station
     *
     * @return cost in dollars
     */
    double cost();

    /**
     * Add automobile to station
     * @param automobile is Auromobile
     */
    void add(Automobile automobile);

    /**
     * Remove automobile by index
     *
     * @param index of automobile
     */
    void remove(int index);

    /**
     * Method for sort automobiles
     */
    void sortAutomobiles();

    /**
     * Find by speed
     *
     * @param start is start bound speed
     * @param end is end bound speed
     * @return list @link{Automobile}
     */
    List<Automobile> findBySpeed(int start, int end);

    /**
     * Return automobiles in string
     *
     * @return string of automobiles
     */
    String getStringAutomobiles();

    /**
     * Return automobiles as objects
     *
     * @return list of automobiles object
     */
    List<Automobile> getAutomobilesList();
}
