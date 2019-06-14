package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textToBeDecorated, PoemDecorator poemDecorator){

        System.out.println(poemDecorator.decorate(textToBeDecorated));
    }

    public static void replaceCharacter(String textToBeDecorated, PoemDecorator poemDecorator){

        System.out.println(textToBeDecorated.replace("o","a"));
    }

    public static void multiplyText(String textToBeDecorated, PoemDecorator poemDecorator){

        System.out.println(textToBeDecorated + textToBeDecorated + textToBeDecorated);
    }
}
