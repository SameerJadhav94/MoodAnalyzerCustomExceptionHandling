package org.bridgelabz.assignmenttwentyoneparttwo;

/**
 * @author -> Sameer Jadhav
 * @version -> 16.0.2
 * @since  -> 2021.10.26
 */
public class MoodAnalyser {
    /***
     * @param message -> If In Sad Mood Should Return Sad Else Return Happy
     */
    public String analyzeMood(String message) {
        if(message.toLowerCase().contains("Sad")){
            return "Sad";
        }else {
            return "Happy";
        }
    }
}