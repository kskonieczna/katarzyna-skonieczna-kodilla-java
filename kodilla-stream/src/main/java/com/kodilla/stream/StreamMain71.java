package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain71 {

    public static void main(String[] args) {

        //beautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //Motive motive = new Motive();

        System.out.println("Making something interesting with the text....");
        poemBeautifier.beautify("Słowa", String::toUpperCase);
        poemBeautifier.beautify("Słowa", String::toLowerCase);
        poemBeautifier.addMotive("Słowa", (textToBeDecorated) -> "~~~" + textToBeDecorated + "~~~");
        poemBeautifier.addSecondMotive("Słowa", (textToBeDecorated) -> "-->" + textToBeDecorated + "<--");
    }
}