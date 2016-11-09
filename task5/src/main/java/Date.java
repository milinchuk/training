/**
 * Created by click on 11/9/2016.
 */
public abstract class Date {
    private Date now;

    public Date() {
    }

    public Date(Date now) {
        this.now = now;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public String toString(){
        return now.toString();
    }
}
