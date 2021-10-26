package org.bridgelabz.assignmenttwentyoneparttwo;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am Sad");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad", result);
    }

}