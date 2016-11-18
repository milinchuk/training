package def;

import model.SomeTaxiStation;
import model.TaxiStation;
import model.entity.Automobile;
import model.entity.Building;
import model.entity.Size;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contain default data for creating Model
 *
 * @author Anastasia Milinchuk
 */
public class DefaultData {
    /**
     * Marks
     */
    private String[] mark = new String[]{"Smart", "Reno", "Ford"};

    /**
     * Models
     */
    private String[] model = new String[]{"Q6", "Kengoo", "Fiesta"};

    /**
     * Types
     */
    private String[] type = new String[]{"minicar", "universal", "hatchback"};

    /**
     * Engine volume
     */
    private double[] engineVolume = new double[]{0.7, 4.1, 3.2};

    /**
     * Speeds
     */
    private int[] speed = new int[]{120, 160, 180};

    /**
     * Prices
     */
    private double[] price = new double[]{30000.0, 20000.0, 35000.0};

    /**
     * This method create taxi station. Get building and automobiles
     *
     * @return @link{TaxiStation}
     */
    public TaxiStation createTaxiStation(){
        TaxiStation station = new SomeTaxiStation(buildBuilding());
        for(Automobile automobile: createAutomobiles()){
            station.add(automobile);
        }

        return station;
    }

    /**
     * This method build building.
     *
     * @return @link{Build}
     */
    public Building buildBuilding(){
        Building building = new Building();
        Size size = new Size();
        size.setHeight(4.0);
        size.setLength(20.0);
        size.setWidth(5.1);

        building.setCost(50000);
        building.setSize(size);
        return building;
    }

    /**
     * This method create automobiles
     *
     * @return list of automobiles
     */
    public List<Automobile> createAutomobiles(){
        List<Automobile> automobiles = new ArrayList<>();
        for(int i = 0; i < model.length; i++){
            Automobile automobile = new Automobile();
            automobile.setMark(mark[i]);
            automobile.setType(type[i]);
            automobile.setPrice(price[i]);
            automobile.setModel(model[i]);
            automobile.setMaxSpeed(speed[i]);
            automobile.setEngineVolume(engineVolume[i]);

            automobiles.add(automobile);
        }
        return automobiles;
    }
}
