package com.ratmirdudin.controller;

import com.ratmirdudin.models.Author;
import com.ratmirdudin.models.Book;
import com.ratmirdudin.models.ELanguages;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class LibraryFactory {
    @NotNull
    public static Library createLibrary() {
        List<Book> newBookList = new ArrayList<>();

        Author JKRowling = new Author("J. K. Rowling", 1965);
        newBookList.add(new Book("Harry Potter and the Philosopher's Stone", 1997, ELanguages.ENGLISH.getLanguage(), JKRowling));
        newBookList.add(new Book("Harry Potter and the Chamber of Secrets", 1998, ELanguages.ENGLISH.getLanguage(), JKRowling));
        newBookList.add(new Book("Harry Potter and the Prisoner of Azkaban", 1999, ELanguages.ENGLISH.getLanguage(), JKRowling));
        newBookList.add(new Book("Harry Potter and the Goblet of Fire", 2000, ELanguages.ENGLISH.getLanguage(), JKRowling));
        newBookList.add(new Book("Harry Potter and the Order of the Phoenix", 2003, ELanguages.ENGLISH.getLanguage(), JKRowling));
        newBookList.add(new Book("Harry Potter and the Half-Blood Prince", 2005, ELanguages.ENGLISH.getLanguage(), JKRowling));
        newBookList.add(new Book("Harry Potter and the Deathly Hallows", 2007, ELanguages.ENGLISH.getLanguage(), JKRowling));

        Author PauloCoelho = new Author("Paulo Coelho", 1947);
        newBookList.add(new Book("The Pilgrimage", 1987, ELanguages.PORTUGUESE.getLanguage(), PauloCoelho));
        newBookList.add(new Book("The Alchemist", 1988, ELanguages.PORTUGUESE.getLanguage(), PauloCoelho));
        newBookList.add(new Book("The Valkyries", 1992, ELanguages.PORTUGUESE.getLanguage(), PauloCoelho));

        Author LevTolstoy = new Author("Lev Tolstoy", 1828);
        newBookList.add(new Book("War and Peace", 1869, ELanguages.RUSSIAN.getLanguage(), LevTolstoy));
        newBookList.add(new Book("Anna Karenina", 1878, ELanguages.RUSSIAN.getLanguage(), LevTolstoy));

        Author CarloCollodi = new Author("Carlo Collodi", 1852);
        newBookList.add(new Book("The Adventures of Pinocchio", 1881, ELanguages.ITALIAN.getLanguage(), CarloCollodi));


        Library library = new Library();

        library.setBookList(newBookList);
        return library;
    }
}
