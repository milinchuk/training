package prototype;

/**
 * Created by click on 11/28/2016.
 */
public class Size implements Cloneable{
    private int height;
    private int width;
    private int length;

    public Size() {
    }

    public Size(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Object clone(){
        return new Size(height, width, length);
    }
}
