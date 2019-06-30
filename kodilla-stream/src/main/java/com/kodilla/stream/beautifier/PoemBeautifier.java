package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String textToBeDecorated, PoemDecorator poemDecorator) {

        return poemDecorator.decorate(textToBeDecorated);
    }

    public String addMotive(String textToBeDecorated, FirstMotive firstMotive) {

        return firstMotive.addFirstMotive(textToBeDecorated);
    }

    public String addSecondMotive(String textToBeDecorated, FirstMotive firstMotive) {

        return firstMotive.addFirstMotive(textToBeDecorated);
    }

    //public Motive addSecondMotives(String textToBeDecorated) {

    //    Motive textWithSecondMotive = (string) -> "-->" + textToBeDecorated + "<--";
     //   return textWithSecondMotive;
    //}
}
