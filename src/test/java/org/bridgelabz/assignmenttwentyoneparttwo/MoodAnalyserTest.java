package org.bridgelabz.assignmenttwentyoneparttwo;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am Sad");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void givenMessageContainsHappyShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am Happy");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void givenMessageContainsNullShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void givenMessageContainsNullOrEmptyShouldThrowMoodAnalysisCustomException() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Happy");
        try{
            String result = moodAnalyser.analyzeMood();
            Assert.assertEquals("Happy", result);
        }catch (MoodAnalysisException e){
            System.out.println(e.getMessage());
        }
    }
}