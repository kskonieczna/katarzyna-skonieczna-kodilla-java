package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textToBeDecorated, PoemDecorator poemDecorator){

        System.out.println(poemDecorator.decorate(textToBeDecorated));
    }
}
