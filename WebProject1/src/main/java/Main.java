import controller.Controller;
import def.DefaultData;
import model.TaxiStation;
import view.View;

/**
 * Main class
 *
 * @author Anastasia Milinchuk
 */
public class Main {
    public static void main(String[] args){
        TaxiStation station = (new DefaultData()).createTaxiStation();
        View view = new View();
        Controller controller = new Controller(station, view);
        controller.discoverTaxiStation();
    }
}
