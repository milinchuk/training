package prototype;

/**
 * Created by click on 11/28/2016.
 */
public class Cube implements Cloneable{
    private Size size;
    private String color;

    public Cube(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Object clone() {
        return new Cube((Size)size.clone(), color);
    }

}
