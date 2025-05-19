import java.util.ArrayList;

public class Order{
    private String name;
    public double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public String getName() {
        return name;
    }
    public boolean isReady() {
        return ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setName() {
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total=0;
        for (Item item : this.items){
            total+=item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + this.getName());

        for (Item item : items){
            System.out.printf("Item: %s - $%.2f\n", item.getName(), item.getPrice());
        }

        System.out.printf("Total: $%.2f\n", getOrderTotal());
    }

}