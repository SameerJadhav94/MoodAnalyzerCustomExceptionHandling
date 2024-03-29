package org.bridgelabz.assignmenttwentyoneparttwo;

/**
 * @author -> Sameer Jadhav
 * @version -> 16.0.2
 * @since -> 2021.10.26
 */
public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException();
        }


    }
}