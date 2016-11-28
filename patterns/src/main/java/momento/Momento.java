package momento;

/**
 * Created by click on 11/28/2016.
 */
public class Momento {
    private final Object state;

    public Momento(Object state) {
        this.state = state;
    }

    public Object getState() {
        return state;
    }
}
