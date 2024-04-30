import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
public class Bag<T> {
    private Map<T, Integer> elements;
    // default constructor
    public Bag() {
        elements = new HashMap<>();
    }
    //add item to bag
    public void add(T item) {
        elements.put(item, elements.getOrDefault(item, 0) + 1);
    }
    public void add(T item, int count) {
        elements.put(item, elements.getOrDefault(item, 0) + count);
    }
    //remove item from bag
    public void remove(T item) {
        if (elements.containsKey(item)) {
            int count = elements.get(item);
            if (count > 1) {
                elements.put(item, count - 1);
            }
            else {
                elements.remove(item);
            }
        }
    }
    //return true or false if bag has specific item
    public boolean contains(T item) {
        return elements.containsKey(item);
    }
    // counts occurences of specified item
    public int count(T item) {
        return elements.getOrDefault(item, 0);
    }
    // returns the size of the bag
    public int size() {
        int total = 0;
        ArrayList<Integer> countSize = new ArrayList<>(elements.values());
        for (int i = 0; i < countSize.size(); i++) {
            total += countSize.get(i);
        }
        return total;
    }
    // Merge bag into a new bag
    public void merge(Bag<T> otherBag) {
        Iterator<Map.Entry<T, Integer>> iterator = otherBag.elements.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, Integer> entry = iterator.next();
            this.add(entry.getKey(), entry.getValue());
        }
    }
    // Method returns a new bag with only distinct elements from current bag
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (T item : elements.keySet()) {
            distinctBag.add(item, 1);
        }
        return distinctBag;
    }
    // Needed to display the items of the bag instead of memory location
    @Override
    public String toString() {
        return elements.toString();
    }
}
