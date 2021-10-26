package org.bridgelabz.assignmenttwentyoneparttwo;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyzeMood("I am Sad");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void givenMessageContainsAnythingOtherThanSadShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyzeMood("I Am In Any Mood");
        Assert.assertEquals("Happy", result);
    }
}