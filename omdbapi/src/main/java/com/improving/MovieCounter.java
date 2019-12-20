package com.improving;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;

public class MovieCounter {

    public void getMovies(String url, Set<String> movieSet) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements year = doc.select("year");

        for (Element years : year) {
            var movieYear = years.
            movieSet.add(years);


        }
    }
}
