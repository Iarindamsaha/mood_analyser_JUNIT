package com.moodanalyser;

public class MoodAnalyser {

    private String message;


    public MoodAnalyser(){

        super();

    }
    public MoodAnalyser(String message) {

        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyserCustomException{

        this.message = message;
        return analyseMood();
    }


    public String analyseMood() throws MoodAnalyserCustomException {

        try {

            if (message.length() == 0){

                throw new MoodAnalyserCustomException(ExceptionType.ENTERED_EMPTY , "Entered Message Can not be Empty");

            }

            if (this.message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (NullPointerException e){

            throw new MoodAnalyserCustomException(ExceptionType.ENTERED_NULL, "Entered Message Can not be Null");

        }



    }
}
