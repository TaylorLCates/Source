package com.improving.bootcamp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.improving.bootcamp.api.JsonViews;

import javax.validation.constraints.NotEmpty;

@JsonNaming()
public class Book {
    @JsonView({JsonViews.SummaryView.class, JsonViews.DetailsView.class})
    @NotEmpty(message = "Enter a title, idiot")
    private final String bookTitle;
    @JsonView({JsonViews.SummaryView.class, JsonViews.DetailsView.class})
    @NotEmpty(message = "Clearly this wasn't written by no one")
    private final String bookAuthor;
    @JsonCreator
    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    @JsonGetter("title")
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
