package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;
//import com.kodilla.stream.forumuser.Forum;
//import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.YEARS;

public class StreamMain {
    private static Vector<Object> git;

    public static void main(String[] args) {





        //7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String inputWord = "aBcDeFgHiJkLmNoPqRsTuWvXyZ";
        System.out.print("converting \"" + inputWord + "\" to uppercase: ");
        System.out.println(poemBeautifier.beautify(inputWord, String::toUpperCase));  //referencja do metody
        System.out.print("converting \"" + inputWord + "\" to lowercase: ");
        System.out.println(poemBeautifier.beautify(inputWord, str -> str.toLowerCase())); // wyrazenie lambda
        System.out.print("first 5 letters of \"" + inputWord + "\": ");
        System.out.println(poemBeautifier.beautify(inputWord, str -> str.substring(0,5)));
        //System.out.println(poemBeautifier.beautify(inputWord, (str, f, s)-> str.substring(f,s)));
        System.out.print("last 5 letters of \"" + inputWord + "\": ");
        System.out.println(poemBeautifier.beautify(inputWord, str -> str.substring(str.length()-5)));
        System.out.print("adding preffix and suffix to \"" + inputWord + "\": ");
        System.out.println(poemBeautifier.beautify(inputWord, str -> "~~~" + str + "~~~"));


        //7.3

//        Forum theUserList = new Forum();
//        Map<Integer, ForumUser> theResultMap = theUserList.getUserList().stream()
//                .filter(user -> user.getSex() == 'M')
//                .filter(user -> YEARS.between(user.getBirthDate(), LocalDate.now()) >= 20)
//                .filter(user -> user.getPostQuantity() > 0)
//                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
//        System.out.println("# elements: " + theResultMap.size());
//        theResultMap.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())git
//                .forEach(System.out::println);


    }
}