package com.ratmirdudin.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    private String title;
    private int firstPublished;
    private String originalLanguage;
    private Author author;
}
