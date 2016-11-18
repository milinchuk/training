import def.DefaultData;
import model.TaxiStation;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for Taxi Station
 *
 * @author Anastasia Milinchuk
 */
public class TaxiStationTest {
    /**
     * Test for sort method
     */
    @Test
    public void sortTest(){
        TaxiStation station = (new DefaultData()).createTaxiStation();
        station.sortAutomobiles();
        for(int i = 1; i < station.getAutomobilesList().size(); i++){
            Assert.assertFalse(station.getAutomobilesList().get(i - 1)
                    .compareTo(station.getAutomobilesList().get(i)) == 1);
        }
    }

    /**
     * Test for finding speed
     */
    @Test
    public void findBySpeed(){
        TaxiStation station = (new DefaultData()).createTaxiStation();
    }
}
