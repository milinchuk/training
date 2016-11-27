package factory.method;

/**
 * Created by click on 11/28/2016.
 */
public class ConcreteCreator implements Creator {
    @Override
    public Connection factoryMethod() {
        return new ConcreteConnection();
    }
}
