
public class Main {
    public static void main(String[] args) {
        Bag<String> bag1 = new Bag<>(); // created instances of bag
        Bag<String> bag2 = new Bag<>();
        Bag<String> bag3 = new Bag<>();

        // several items added to bag1
        bag1.add("carrots");
        bag1.add("milk");
        bag1.add("cereal");
        bag1.add("grapes");
        bag1.add("carrots");
        bag1.add("banana");
        bag1.add("milk");

        // several items added to bag2
        bag2.add("soda");
        bag2.add("oreos");
        bag2.add("pasta");
        bag2.add("soda");
        bag2.add("carrots");
        bag2.add("banana");
        bag2.add("cranberries");
        bag2.add("banana");
        bag2.add("banana");

        // print size of bag1 and bag2
        System.out.println("Size of first bag: " + bag1.size());
        System.out.println("Size of second bag: " + bag2.size());

        // print the bag1 and bag2 contents
        System.out.println("Bag contents:" + bag1);
        System.out.println("Bag contents:" + bag2);

        // merge bag1 and bag2
        bag1.merge(bag2);

        //create a new bag containing only distinct elements
        bag3 = bag1.distinct();

        //print distinct bag
        System.out.println("Merged bag contents:" + bag3);

        // create a new bag with only distinct elements
        System.out.println("Distinct bag contents: " + bag1.distinct());
    }
}