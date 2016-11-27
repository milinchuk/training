package builder;

/**
 * Created by click on 11/28/2016.
 */
public abstract class Builder {
    protected Building building;

    public abstract void setPlace(String place);
    public abstract void setMatherial(String matherial);
    public void createBuilding(){
        building = new Building();
    }

    public Building getBuilding() {
        return building;
    }
}
