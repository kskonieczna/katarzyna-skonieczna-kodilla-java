package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamMainAll {

    public static void main(String[] args) {

        //beautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Making something interesting with the text....");
        poemBeautifier.beautify("Słowa", String::toUpperCase);
        poemBeautifier.beautify("Słowa", String::toLowerCase);
        poemBeautifier.multiplyText("Słowa",PoemBeautifier::multiplyText)
        //:: nie może mieć parametru, czylil trzeba lambdę zastosować

        /*
        //iterate
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        //people
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);


        //book
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        //forumuser
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.calculateAge(forumUser.getUserDateOfBirth(), LocalDate.now()) > 20)
                .filter(forumUser -> forumUser.getPostNumber() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

         */
    }
}