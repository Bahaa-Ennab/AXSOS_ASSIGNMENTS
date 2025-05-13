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

    public String guestGreeting(String name, String dayPeriod) {
        Date date= new Date();
        int periodOfDay = date.getHours();
        if (periodOfDay <= 12){
            String periodOofDay = "morning";
            String guest = String.format("Good %s , %s. Lovely to see you",periodOofDay, name);
            return guest;

        }
        else{
            String periodOofDay = "evening";
            String guest = String.format("Good %s , %s. Lovely to see you",periodOofDay, name);
            return guest;

        }
        
        // // YOUR CODE HERE
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
        public String lovingOrHatingBack(String loveorhate ){
            String response;
            if (loveorhate.contains("love Alfred")){
                response = "Love";
            }
            else if (loveorhate.contains("hate Alfred")) {
                response = "Hate";
            }
            else {
                response = "Nothing";
            }

            switch(response){
                case "Love":
                    String love = "I love you too my dear!";   
                    return love ;                
                case "Hate":
                    String hate = "I am not thrilled about you either";  
                    return hate;                
                case "Nothing":
                    String nothing = "do you love Alfred?";  
                    return nothing;                
            }
            return response;
        }
}