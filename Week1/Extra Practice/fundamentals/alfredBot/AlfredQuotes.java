import java.util.Date;
import java.text.SimpleDateFormat;


/** 
* Alfred Quotes library class for AlfredBot to help Batman while Alfred is on vacation.
*/
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    /** 
     * Overload method returns a greeting that includes the person's name. 
     * @param name person's name
     * @return greeting that includes a person's name
     */
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    /** 
     * Overload method returns a greeting including the person's name as well as the day period.
     * @param name person's name
     * @param dayPeriod time of day (e.g. "morning", "evening")
     * @return greeting that includes a person's name and time of day
     */
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", name, dayPeriod);
    }

    /** 
     * Method returns a greeting including the day period.
     * @return greeting that includes the time of day
     */
    public String guestGreeting() {
        Date currentDateTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        int currentHour = Integer.parseInt(formatter.format(currentDateTime));
        String dayPeriod;
        if (currentHour > 16 || currentHour < 6 ){
            dayPeriod = "evening";
        } else if (currentHour > 11){
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "morning";
        }
        return String.format("Good %s. How may I help you?", dayPeriod);
    }

    /** 
     * Returns a polite announcement of the current date and time.
     * @return announcement of current date and time
     */
    public String dateAnnouncement() {
        Date currentDateTime = new Date();
        return String.format("It is currently %s.", currentDateTime);
    }

    /** 
     * Accepts any string of conversation and returns appropriate response
     * @param conversation string of conversation
     * @return appropriate response from Alfred
     */
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}