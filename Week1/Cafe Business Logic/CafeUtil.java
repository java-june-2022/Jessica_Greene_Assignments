import java.util.ArrayList;

public class CafeUtil {
    /*
        int getStreakGoal()
        Sums together every consecutive integer from 1 to 10 and returns the sum. 
        return Sum of integers from 1 to 10
    */
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    /*
        Sums together every consecutive integer from 1 to the given number of weeks
        param: numWeeks number of consecutive weeks a customer must buy more drinks than the previous week
        return sum of integers from 1 to given number of weeks
    */
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    /*
        Given an array of item prices from an order, sums all of the prices in the array and return the total. 
        param prices array of prices from an order
        return total price of the order
    */
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices){
            total += price;
        }
        return total;
    }

    /*
        Given an ArrayList of menu items (strings), print out each index and menu item. 
    */
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i=0; i < menuItems.size(); i++) {
            String menuItem = menuItems.get(i); 
            System.out.println(String.format("%d %s", i, menuItem));
        }
    }

    /*
        Prompts customer for name. Greets customer. Displays the number of people in front of the customer.
        Adds the customer's name to the list and prints the list.
    */
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        
        String greetingStart = "There are ";
        String greetingEnd = " people in front of you";
        if (customers.size() == 1) {
            greetingStart = "There is ";
            greetingEnd = " person in front of you";
        }
        System.out.println(greetingStart + customers.size() + greetingEnd);

        customers.add(userName);
        System.out.println(customers);
    }
}