package factory.method;

/**
 * Created by click on 11/28/2016.
 */
public interface Connection {
    public void connect();
    public void execute(Object o);
    public void close();
}
