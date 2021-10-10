package com.ratmirdudin.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Author {
    private String fullName;
    private int yearOfBirth;
}
