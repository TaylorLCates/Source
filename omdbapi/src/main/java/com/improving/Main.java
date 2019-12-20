package com.improving;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {


        var movieCounter = new MovieCounter();
        Set<String> setOfMovies = new HashSet<>();

        movieCounter.getMovies("http://www.omdbapi.com/?i=tt3896198&apikey=b125a052", setOfMovies);
    }
}

