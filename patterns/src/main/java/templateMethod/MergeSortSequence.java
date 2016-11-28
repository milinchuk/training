package templateMethod;

/**
 * Created by click on 11/28/2016.
 */
public class MergeSortSequence extends SortedSequence {
    @Override
    public void addElement(Object element) {
        elements.add(element);
    }

    @Override
    public void sort() {
        // do merge sort
    }

}
