package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    // lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition_INTERFEJS(String titleFragment);

    // list books borrowed by libraryUser
    List<Book> listBooksInHandsOf_INTERFEJS(LibraryUser libraryUser);


    boolean rentABook(LibraryUser libraryUser, Book book);


    int returnBooks(LibraryUser libraryUser);

}