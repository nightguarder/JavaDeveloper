package com.cyrils.java.lekce14;

//Dědí z java.lang.Exception a implementuje CustomExceptions interface
/* 
 * Je dobré překrýt minimálně tyto konstruktory
 * () - Bezparametrický
 * (String message) - Konstruktor se textovým popisem výjimky
 * (String message, Throwable cause) - Konstruktor se textovým popisem výjimky a zabalované výjimky.
 */
public class IllegalAgeException extends Exception implements CustomExceptions {
    // Bezparametrický konstruktor
    public IllegalAgeException() {
        super("Neplatný věk!"); // Výchozí zpráva
    }
    // Konstruktor se zprávou
    public IllegalAgeException(String message) {
        super(message);
    }
    // Konstruktor se zprávou a příčinou
    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }
    @Override
    public String getOriginalMessage() {
        return super.getMessage();
    }
    @Override
    public String getErrorCode() {
        return "ILLEGAL_AGE";
    }
    @Override
    public String getDetails() {
        return "Neplatný věk!";
    }
}
