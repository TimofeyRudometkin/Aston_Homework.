package Homework_2_1;

import java.util.*;

//HashSet<String> hashsetInner = new HashSet<String>();
public class HashSetAnalog<E>
        extends AbstractSet<E>
        implements Set<E> {

    private transient HashMap<E,Object> map;
    private static final Object PRESENT = new Object();

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
    public int size() {
        return map.size();
    }
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

}
