package model;

import model.entity.Automobile;

import java.util.List;

/**
 * Created by click on 11/13/2016.
 */
public interface TaxiStation {
    double cost();
    void sortAutomobiles();
    List<Automobile> findBySpeed(int start, int end);
    String getAutomobilesToString();
}
