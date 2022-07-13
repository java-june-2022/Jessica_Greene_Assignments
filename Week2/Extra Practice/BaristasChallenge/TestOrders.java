import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        //Menu Items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("drip coffee", 2);
        Item item3 = new Item("latte", 3.25);
        Item item4 = new Item("cappucino", 2.5);

        //Orders
        //Create 2 orders for unspecified guests (without specifying a name)
        Order order1 = new Order();
        Order order2 = new Order();
        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Jessica");
        Order order4 = new Order("Trevon");
        Order order5 = new Order("Caleb");

        // Add at least 2 items to each of the orders using the addItem method you wrote
        order1.addItem(item1);
        order1.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item2);
        order3.addItem(item3);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);

        //Test
        order1.display();
        System.out.println("__________________________");
        order2.display();
        System.out.println("__________________________");
        order3.display();
        System.out.println("__________________________");
        order4.display();
        System.out.println("__________________________");
        order5.display();
    }
}