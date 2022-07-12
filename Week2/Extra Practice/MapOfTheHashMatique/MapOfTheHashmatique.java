import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        //Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
        //Add in at least 4 songs that are stored by title
        trackList.put("Song1", "These are the lyrics to song number 1!");
        trackList.put("Song2", "Sing. Sing. Sing along to track number 2.");
        trackList.put("Song3", "Song 3 breaks my heart into pieces.");
        trackList.put("Song4", "Have a drumstick and your brain stops ticking.");
        //Pull out one of the songs by its track title
        System.out.println(trackList.get("Song4"));
        //Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> titles = trackList.keySet();
        for(String title : titles) {
            System.out.print(title + ": ");
            System.out.println(trackList.get(title));
        }

    }
}