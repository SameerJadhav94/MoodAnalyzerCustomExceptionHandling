package org.bridgelabz.assignmenttwentyoneparttwo;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am Sad");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void givenMessageContainsHappyShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am Happy");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void givenMessageContainsNullShouldReturnExceptionMessageInputCannotBeNull(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Input Cannot Be null", result);
    }
}