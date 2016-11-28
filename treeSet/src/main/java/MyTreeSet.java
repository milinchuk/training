import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by click on 11/28/2016.
 */
public class MyTreeSet<T extends Comparable> implements Set {
    private int size = 0;
    private Tree<T> tree = new Tree<T>();
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public T[] toArray(Object[] a) {
        return null;
    }

    private class Tree<T extends Comparable>{
        private Tree<T> leftTree;
        private T element;
        private Tree<T> righTree;

        private Tree() {
        }

        private Tree(Tree<T> leftTree, T element, Tree<T> righTree) {
            this.leftTree = leftTree;
            this.element = element;
            this.righTree = righTree;
        }

        public int add(T element){
            if (this.element == null) {
               this.element = element;
            } else if (this.element.compareTo(element) == 1) {
                leftTree.add(element);
            } else if (this.element.compareTo(element) == -1) {
                righTree.add(element);
            } else {
                return 0;
            }
            return 1;
        }

        public Tree<T> getLeftTree() {
            return leftTree;
        }

        public void setLeftTree(Tree<T> leftTree) {
            this.leftTree = leftTree;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Tree<T> getRighTree() {
            return righTree;
        }

        public void setRighTree(Tree<T> righTree) {
            this.righTree = righTree;
        }
    }
}
