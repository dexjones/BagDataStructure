import java.util.HashMap;
import java.util.Map;
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

    // Needed to display the items of the bag instead of memory location
    @Override
    public String toString() {
        return elements.toString();
    }
}
