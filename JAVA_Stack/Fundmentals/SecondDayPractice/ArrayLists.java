import java.util.ArrayList;
public final class ArrayLists {
    
    public static void main(String[] args){
        String[] words = {"it", "is", "this", "we", "do", "how"};
        ArrayList<String> phrase = new ArrayList<String>();
        phrase.add(words[2]);
        phrase.add(words[3]);
        // Pull words from the 'words' array to populate the 'phrase' array list
        // Print the 'phrase' array list
        // Expected output: [this, is, how, we, do, it]
        System.out.println(phrase);
    }
}