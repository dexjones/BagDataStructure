
public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>(); // create instance of Bag

        // several items added to bag
        bag.add("carrots");
        bag.add("milk");
        bag.add("cereal");
        bag.add("grapes");
        bag.add("carrots");
        bag.add("banana");
        bag.add("milk");

        // print the bag contents
        System.out.println("Bag contents:" + bag);

        // test the contains method
        System.out.println("Contains 'milk': " + bag.contains("milk"));
        System.out.println("Contains 'soda': " + bag.contains("soda"));

        // test count method
        System.out.println("The count of 'carrots' = " + bag.count("carrots"));
        System.out.println("The count of 'cereal' = " + bag.count("cereal"));

        // test remove method
        bag.remove("milk");
        System.out.println("removed 'milk' item from bag:\n" + bag + "\n");

        // test contains method
        System.out.println("Contains 'milk': " + bag.contains("milk"));

        // test count method
        System.out.println("The count of 'milk' = " + bag.count("milk"));
    }
}