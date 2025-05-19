import java.util.ArrayList;

public class CoffeeKiosk{
    public ArrayList<Item> menu = new ArrayList<Item>();
    public ArrayList<Order> orders = new ArrayList<Order>();

    public void addMenuItem(Item item){
        menu.add(item);

    }

    public String displayMenu(){
        StringBuilder output = new StringBuilder();
        int i = 0;
        for(Item item : menu){
            output.append(i)
                .append(" ")
                .append(item.getName())
                .append(" -- ")
                .append(item.getPrice())
                .append(" $")
                .append("\n");
            i++;
        }
        return output.toString();
    }


    public void newOrder() {

        Order order = new Order();
        
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        order.setName(name);
        // Your code:
        // Create a new order with the given input string
        
        // Show the user the menu, so they can choose items to add.
        System.out.println(displayMenu());
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order itemsq
        while(!itemNumber.equals("q")) {
            Integer index = Integer.parseInt (itemNumber);
            order.addItem(menu.get(index));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        order.display();
        // After you have collected their order, print the order details 

    }


}
