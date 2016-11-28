package templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 11/28/2016.
 */
public abstract class SortedSequence {
    protected List<Object> elements;

    protected SortedSequence() {
        elements = new ArrayList<Object>();
    }

    public abstract void addElement(Object element);
    public abstract void sort();
    public void work(Object element){
        addElement(element);
        sort();
        showElements();
    }
    public void showElements() {
        System.out.println(elements);
    }
}
