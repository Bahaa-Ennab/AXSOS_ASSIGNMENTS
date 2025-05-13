import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guest = String.format("Hello, %s. Lovely to see you", name);
        // YOUR CODE HERE
        return guest;
    }
    
    public String dateAnnouncement() {
        Date date= new Date() ;
        // YOUR CODE HERE
        return ("it is currently : " + date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        String called;
        if (conversation.contains("Alexis")){
            called = "Alexis";
        }
        else if (conversation.contains("Alfred")){
            called = "Alfred";
        }
        else{
            called = "NoOne";
        }

        switch(called){
            case "Alexis":
                String response = "Right away, sir. She certainly isn't sophisticated enough for that ";
                return response;
            case "Alfred":
                String response1 = "At your service. As you wish, naturally.";
                return response1;
            case "NoOne":
                String response2 = "Right. And with that I shall retire. ";
                return response2;

        }
        return called;
    }
    
    // NINJA BONUS
    // See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}