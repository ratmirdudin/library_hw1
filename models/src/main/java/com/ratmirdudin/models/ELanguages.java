package com.ratmirdudin.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ELanguages {
    ENGLISH("English"),
    RUSSIAN("Russian"),
    ITALIAN("Italian"),
    PORTUGUESE("Portuguese");

    private String language;
}
