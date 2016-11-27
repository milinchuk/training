package builder;

/**
 * Created by click on 11/28/2016.
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void setPlace(String place) {
        place = place + riseGazone();
        building.setPlace(place);
    }

    @Override
    public void setMatherial(String matherial) {
        building.setMatherial(matherial + increaseMatherial());
    }

    private String riseGazone(){
        return "Green gazone";
    }

    private String increaseMatherial(){
        return "Increase matherial";
    }
}
