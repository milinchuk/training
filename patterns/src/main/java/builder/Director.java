package builder;

/**
 * Created by click on 11/28/2016.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build(String place, String matherial){
        builder.setPlace(place);
        builder.setMatherial(matherial);
    }

    public Building getBuilding(){
        return builder.getBuilding();
    }
}
