package com.bridgelabz.indianstatesenses;


public class CensusAnalyserException extends Exception {
    public enum ExceptionType {
        CENSUS_FILE_INCORRECT, CENSUS_INCORRECT_FILE_FORMAT, CENSUS_WRONG_DELIMITER, CENSUS_WRONG_HEADER;
    }

    public ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}