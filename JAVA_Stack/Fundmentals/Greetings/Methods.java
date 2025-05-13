public class Methods {
    public static void main(String[] args){
        // Print "Hello Huda, how are you today?" and "Hello Sami Taha, how are you today?"
        // Your code here
        
    }
    // Don't worry about the 'public' and 'static' keywords for now.
    // We will discuss them later.
    public static String greeting(String name){
        return String.format("Hello %s, how are you today?", "sami");
    }
    public static String greeting(String firstName, String lastName){
        return String.format("Hello %s %s, how are you today?", firstName, lastName);
    }
}