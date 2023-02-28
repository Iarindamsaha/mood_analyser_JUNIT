package com.moodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {
    @Test
    @DisplayName("Sad Mood Testing")
    public void givenMessage_WhenSad_ShouldReturn_Sad() {

        MoodAnalyser obj = new MoodAnalyser("I am in Sad Mood");
        String mood = obj.analyseMood();
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    @DisplayName("Happy Mood Testing")
    public void givenMessage_WhenNotSad_ReturnHappy(){

        MoodAnalyser obj = new MoodAnalyser("I am in Happy Mood");
        String mood = obj.analyseMood();
        Assertions.assertEquals("HAPPY",mood);

    }

    @Test
    public void given_Null_Mood_Return_Happy(){

        MoodAnalyser mood = new MoodAnalyser(null);
        String moodCheck = mood.analyseMood();
        Assertions.assertEquals("HAPPY",moodCheck);

    }


}
