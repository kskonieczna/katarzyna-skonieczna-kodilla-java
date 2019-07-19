package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {

        //zwraca klasę w której jest wywoływana, ClassLoader pozwala odnaleźć plik w naszym projekcie
        ClassLoader classLoader = getClass().getClassLoader();
        //wywołanie metody która pokazuje gdzie ClassLoader ma szukać pliku
        File file;
        file = new File(classLoader.getResource("file/naes.txt").getFile());
        //klasa Path pozwala na modyfikację ścieżki o typie string na obiekt Path
        //Path path = Paths.get(file.getPath());
        //stream obiektów reprezentujących linie w pliku tekstowym

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {

            fileLines.forEach(System.out::println);

            //e to referencja do obiektu wyjątku
        } catch (IOException e) {

            throw new FileReaderException();

        } finally {

            System.out.println("I'm going to be here..always!");
        }
    }
}