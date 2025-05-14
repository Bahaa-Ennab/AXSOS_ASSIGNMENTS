import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil{
    public int getStreakGoal(int numWeeks){
        int repeat = numWeeks;
        int total=0;
        for(int i = 0 ; i <= repeat ; i++ ){
            total+=i;
        }
        return total;
    }
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(double price : prices){
            sum=sum + price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        int i = 0;
        while(i<menuItems.size()){
            System.out.println(i + " - "+menuItems.get(i));
            i++;
        }

    }
    public static void addCustomer(ArrayList<String>  customers){
        System.out.println("Enter your name please");
        String username = System.console().readLine();
        System.out.println("Hello" + username);
        System.out.println("there are" + customers.size() + "in front of you");
        customers.add(username);

    }
    
}