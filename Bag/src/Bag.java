import java.util.*;

public class Bag<T> {
    private List<T> items;

    // default constructor
    public Bag() {
        items = new ArrayList<>();
    }
    //add item to bag
    public void add(T item) {
        items.add(item);
    }
    //remove item from bag
    public void remove(T item) {
        items.remove(item);
    }
    //return true or false if bag has specific item
    public boolean contains(T item) {
        return items.contains(item);
    }
    // counts occurences of specified item
    public int count(T item) {
        int count = 0;
        for (int i = 0; i < items.size(); i++ ) {
            T elem = items.get(i);
            if (elem.equals(item)) {
                count++;
            }
        }
        return count;
    }
    // returns the size of the bag
    public int size() {
        return items.size();
    }

    // Needed to display the items of the bag instead of memory location
    @Override
    public String toString() {
        return items.toString();
    }
}
