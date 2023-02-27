package com.moodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {
    @Test
    @DisplayName("Sad Mood Testing")
    public void givenMessage_WhenSad_ShouldReturn_Sad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    @DisplayName("Happy Mood Testing")
    public void givenMessage_WhenNotSad_ReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am Happy Now");
        Assertions.assertEquals("HAPPY",mood);

    }
}
