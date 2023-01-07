import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyQueueImpl implements MyQueue {

    Collection<String> coll = new LinkedList<String>();


    @Override
    public void add(Object el) {
        coll.add((String) el);

    }

    @Override
    public void delete(Object el) {
        coll.remove(el);

    }

    @Override
    public void isEmpty(Object el) {
        System.out.println(coll.contains(el));

    }

    public void print() {
        System.out.println(coll);
    }
}
