package controller;

import model.TaxiStation;
import view.View;

/**
 * Created by click on 11/14/2016.
 */
public class Controller {
    private TaxiStation taxiStation;
    private View view;

    public Controller(TaxiStation taxiStation, View view) {
        this.taxiStation = taxiStation;
        this.view = view;
    }

    public void discoverTaxiStation(){
        taxiStation.sortAutomobiles();
        view.print(View.AUTOMOBILES, taxiStation.getAutomobilesToString());
        view.print(View.COST, Double.toString(taxiStation.cost()));
        view.print(View.FIND_AUTOMOBILES, taxiStation.findBySpeed(10, 50).toString());
    }
}
