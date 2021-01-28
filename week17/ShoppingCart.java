package a_review.week17;

import java.util.Stack;

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


public class ShoppingCart {
    public static void main(String[] args) {

        // code that add item to shopping cart

        Stack<Item> allItems = new Stack<>();
        allItems.add(new Item("apple", 2.5));
        allItems.add(new Item("orange", 3));
        allItems.add(new Item("mango", 2.1));

        // In the end of the shopping cart page, you get all the element
        // Verify if the order matches

        System.out.println(allItems.peek());  // list -> 0 -> mango == element (mango)

    }
}
