package controller;

import model.TaxiStation;
import view.View;

/**
 * Controller discover taxi station. Have as model TaxiStation and as View View
 *
 * @author Anastasia Milinchuk
 */
public class Controller {
    /**
     * This is model of project
     */
    private TaxiStation taxiStation;

    /**
     * This is view of project. Show messages on screen
     */
    private View view;

    /**
     * Constructor
     *
     * @param taxiStation is taxi station
     * @param view is view
     */
    public Controller(TaxiStation taxiStation, View view) {
        this.taxiStation = taxiStation;
        this.view = view;
    }

    /**
     * This method sort automobiles, show all of them, calculate cost of full taxi station,
     * find automobiles by speed
     */
    public void discoverTaxiStation(){
        taxiStation.sortAutomobiles();
        view.print(View.AUTOMOBILES, taxiStation.getStringAutomobiles());
        view.print(View.COST, Double.toString(taxiStation.cost()));
        view.print(View.FIND_AUTOMOBILES, taxiStation.findBySpeed(100, 120).toString());
    }
}
