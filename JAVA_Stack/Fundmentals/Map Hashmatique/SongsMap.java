import java.util.HashMap; 
import java.util.Set;

public class SongsMap{
    HashMap<String, String> SongsMap = new HashMap<String, String>();
    public SongsMap(){
        SongsMap.put("Perfect","I found a love for me  Oh, darling, just dive right in and follow my leadWell, I found a girl, beautiful and sweet Oh, I never knew you were the someone waitin' for me 'Cause we were just kids when we fell in love, not knowin' what it was I will not give you up this time Oh, darling, just kiss me slow, your heart is all I own And in your eyes, you're holding mine");
        SongsMap.put("ShapeOfYOu"," The club isn't the best place to find a lover So the bar is where I go (mm) Me and my friends at the table doing shots Drinking fast and then we talk slow");
        SongsMap.put("TakeMeBAckToLondon"," et-plane headed up to the sky Spread wings in the clouds, getting high We ain't hit a rave in a while So take me back to London (Yo)" );
        SongsMap.put("ISeeFire","Oh, misty eye of the mountain below Keep careful watch of my brothers' souls And should the sky be filled with fire and smoke Keep watching over Durin's sons");
        Set<String> keys = SongsMap.keySet();
        for (String key : keys) {
        System.out.println("Song title: " + key + " Lyrics : " + SongsMap.get(key));
        
        }
    }
    public static void main(String[] args) {
        new SongsMap();
    }
}
