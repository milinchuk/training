import java.util.*;

/**
 * Created by click on 11/30/2016.
 */
public class HashMap<K, V> implements Map<K, V> {
    private int capacity = 16;
    private List<Node>[] objects;
    private int size = 0;

    public HashMap() {
        objects = new List[capacity];
        for (List<Node> list: objects){
            list = new ArrayList<Node>();
        }
    }

    private class Node {
        private K key;
        private V value;

        private Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int hash = getHash(key);
        for (Node n: objects[hash]) {
            if (n.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    private int getHash(Object key) {
        return key.hashCode() % capacity;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < capacity; i++) {
            for (Node node: objects[i]) {
                if (node.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        List<Node> nodes = objects[getHash(key)];
        for(Node node: nodes) {
            if (node.getKey().equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int hash = getHash(key);
        for (Node node: objects[hash]) {
            if (node.key.equals(key)) {
                return null;
            }
        }
        objects[hash].add(new Node(key, value));
        return value;
    }

    @Override
    public V remove(Object key) {
        int hash = getHash(key);
        for (Node node: objects[hash]) {
            if (node.key.equals(key)) {
                V value = node.value;
                objects[hash].remove(node);
                return value;
            }
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        objects = new List[capacity];
        for (List<Node> list: objects){
            list = new ArrayList<Node>();
        }
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
