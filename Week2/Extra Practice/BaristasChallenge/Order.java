import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;
    public Order() {
        name = "Guest";
        items = new ArrayList<Item>();
    }
    public Order(String name) {
        this();
        this.name = name;
        // items = new ArrayList<Item>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isReady() {
        return ready;
    }
    public void setReady(Boolean ready) {
        this.ready = ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for ( Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + " - " + moneyFormat(item.getPrice()));
        }
        System.out.println("Total: " + moneyFormat(this.getOrderTotal()));
    }

    public static String moneyFormat(double value ) {
        Locale locale = new Locale("en", "US");      
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String valueString = currencyFormatter.format(value);
        return valueString;
    }
}