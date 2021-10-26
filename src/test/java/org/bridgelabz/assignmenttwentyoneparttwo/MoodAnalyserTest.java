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
}