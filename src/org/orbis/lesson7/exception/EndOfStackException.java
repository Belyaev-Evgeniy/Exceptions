package org.orbis.lesson7.exception;

public class EndOfStackException extends Exception{

    public String getMessage() {
        String message = "reach end of stack";
        return message;
    }
}