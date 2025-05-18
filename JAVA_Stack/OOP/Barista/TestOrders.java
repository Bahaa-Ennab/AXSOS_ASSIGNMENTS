import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item Item1= new Item();
        Item1.setName("mocha");
        Item1.setPrice(5);
        Item Item2= new Item();
        Item2.setName("Coffee");
        Item2.setPrice(7);
        Item Item3= new Item();
        Item3.setName("latte");
        Item3.setPrice(10);
        // System.out.println(Item1.getName());
        // System.out.println(Item1.getPrice());
        Order order1 = new Order();
        order1.setName();
        order1.setReady(true);
        order1.addItem(Item1);
        order1.addItem(Item3);
        Order order2 = new Order();
        order2.setName();
        order2.setReady(true);
        order2.addItem(Item2);
        order2.addItem(Item3);
        Order order3 = new Order();
        order3.setName("ahmad");
        order3.setReady(true);
        order3.addItem(Item2);
        order3.addItem(Item1);
        Order order4 = new Order();
        order4.setName("ramz");
        order4.setReady(true);
        order4.addItem(Item2);
        order4.addItem(Item1);
        Order order5 = new Order();
        order5.setName("murad");
        order5.setReady(true);
        order5.addItem(Item2);
        order5.addItem(Item2);
        // System.out.println(order1.getStatusMessage());
        System.out.println(order4.getOrderTotal());
        order1.display();
        System.out.println("----------------------------------------------------------");
        order2.display();
        System.out.println("----------------------------------------------------------");
        order3.display();
        System.out.println("----------------------------------------------------------");
        order4.display();
        System.out.println("----------------------------------------------------------");
        order5.display();
        // System.out.println(order3.getName());
        // System.out.println(order1.isReady());
        // System.out.println(order1.getItems());


    }
}