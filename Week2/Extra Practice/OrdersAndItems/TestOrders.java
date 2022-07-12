import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        //Menu Items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "dripCoffee";
        item2.price = 2;

        Item item3 = new Item();
        item3.name = "latte";
        item3.price = 3.25;

        Item item4 = new Item();
        item4.name = "cappucino";
        item4.price = 2.5;


        //Orders

        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Sam";
        addItemToOrder(order2, item1);

        Order order3 = new Order();
        order3.name = "Jimmy";
        addItemToOrder(order3, item4);

        Order order4 = new Order();
        order4.name = "Noah";
        addItemToOrder(order4, item3);


        //Order Modifications

        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        //Sam ordered more drinks - 2 lattes. Update their order as well.
        addItemToOrder(order2, item3);
        addItemToOrder(order2, item3);
        
        //Jimmy’s order is now ready. Update his status.
        order3.ready = true;


        //Test Order 1
        // System.out.println(order1);
        // System.out.println(order1.total);

        // Test Order 2
        // System.out.println(order2.items.get(0).name);
        // System.out.println("Order Total: " + order2.total);

        //Test Order 3
        // System.out.println(order3.items.get(0).name);
        // System.out.println(order3.total);
    
        //Test Order 4
        // System.out.println(order4.items.get(0).name);
        // System.out.println(order4.total);

        //Test Sam ordered mor drinks
        // System.out.println(order2.total);
    }

    private static void addItemToOrder(Order order, Item item) {
        order.items.add(item);
        order.total += item.price;
    }
}