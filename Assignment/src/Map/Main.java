package Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();

        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);


        System.out.println("Value for key 'two': " + myMap.get("two"));
        System.out.println("Value for key 'five': " + myMap.get("five"));


        System.out.println("Removed value for key 'one': " + myMap.remove("one"));
        System.out.println("Value for key 'one' after removal: " + myMap.get("one")); // Should print null

        // Trying to remove a non-existing key-value pair
        System.out.println("Trying to remove non-existing key 'four': " + myMap.remove("four")); // Should print null
    }
}
