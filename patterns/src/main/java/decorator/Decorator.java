package decorator;

/**
 * Created by click on 11/28/2016.
 */
public abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent component;

    public Decorator (InterfaceComponent c) {
        component = c;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}