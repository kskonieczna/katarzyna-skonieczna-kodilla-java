package com.kodilla.stream.beautifier;

public interface PoemDecorator {

    public String decorate(String textToBeDecorated);

    public static void replaceCharacter(String textToBeDecorated){

        System.out.println(textToBeDecorated.replace("o","a"));
    }
}
