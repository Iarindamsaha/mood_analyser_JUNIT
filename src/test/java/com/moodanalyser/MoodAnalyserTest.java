package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {
    @Test
    //("Sad Mood Testing")
    public void givenMessage_WhenSad_ShouldReturn_Sad() {

        MoodAnalyser obj = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = obj.analyseMood();
        } catch (MoodAnalyserCustomException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("SAD",mood);
    }

    @Test
    //("Happy Mood Testing")
    public void givenMessage_WhenNotSad_ReturnHappy(){

        MoodAnalyser obj = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = obj.analyseMood();
        } catch (MoodAnalyserCustomException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("HAPPY",mood);

    }

    //TC 3.1
    @Test
    public void given_Null_Mood_Return_Message (){

        MoodAnalyser mood = new MoodAnalyser(null);
        try {

            mood.analyseMood(null);

        } catch (MoodAnalyserCustomException e) {

            Assert.assertEquals("Entered Message Can not be Null",e.getMessage());

        }
    }

    //TC 3.2
    @Test
    public void check_if_Given_Message_is_Null_(){

        MoodAnalyser mood = new MoodAnalyser(null);
        try {

            mood.analyseMood(null);

        } catch (MoodAnalyserCustomException e) {

            Assert.assertEquals(ExceptionType.ENTERED_NULL,e.type);

        }
    }

    @Test
    public void check_if_Given_Message_is_Empty_ (){

        MoodAnalyser mood = new MoodAnalyser("");
        try {

            mood.analyseMood("");

        } catch (MoodAnalyserCustomException e) {

            Assert.assertEquals(ExceptionType.ENTERED_EMPTY,e.type);

        }
    }
}
