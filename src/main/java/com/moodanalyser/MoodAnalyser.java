package com.moodanalyser;

public class MoodAnalyser {


    public String analyseMood(String thisIsASadMessage) {
        if (thisIsASadMessage.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
