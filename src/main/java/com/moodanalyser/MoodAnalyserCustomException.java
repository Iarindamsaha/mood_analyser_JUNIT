package com.moodanalyser;


enum ExceptionType{
    ENTERED_EMPTY,
    ENTERED_NULL
}
public class MoodAnalyserCustomException extends Exception{

    ExceptionType type;

    public MoodAnalyserCustomException(ExceptionType type , String message) {

        super(message);
        this.type = type;

    }


}
