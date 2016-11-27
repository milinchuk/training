package decorator;

/**
 * Created by click on 11/28/2016.
 */
public class MainComponent implements InterfaceComponent {
    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}