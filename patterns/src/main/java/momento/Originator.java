package momento;

import observer.Observer;

/**
 * Created by click on 11/28/2016.
 */
public class Originator implements Cloneable{
    private int length;
    private int wigth;

    public Originator(int length, int wigth) {
        this.length = length;
        this.wigth = wigth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWigth() {
        return wigth;
    }

    public void setWigth(int wigth) {
        this.wigth = wigth;
    }

    public Momento saveState(){
        return new Momento(this.clone());
    }

    @Override
    public Object clone(){
        return new Originator(length, wigth);
    }
}
