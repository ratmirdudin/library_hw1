package com.ratmirdudin.controller;

import com.ratmirdudin.models.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Library {
    private List<Book> bookList;
}
