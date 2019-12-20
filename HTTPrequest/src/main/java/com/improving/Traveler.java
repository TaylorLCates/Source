package com.improving;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Traveler {

    public void getLinks(String url, Set<String> linkSet) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");

        for (Element link : links) {

            var fullLinks = link.attr("abs:href");
            var cutLinks = fullLinks.split("#");
            var firstLink = cutLinks[0];

            if (firstLink.startsWith("https://improving.com")) {

                if (!linkSet.contains(firstLink)) {
                    System.out.println("tick");
                    linkSet.add(firstLink);
                    try {
                        getLinks(firstLink, linkSet);
                    } catch (UnsupportedMimeTypeException ex) {
                        System.out.println("nope");
                    } catch (HttpStatusException ex) {
                        System.out.println("404");
                        linkSet.remove(firstLink);
                    }
                }
            }
        }

        System.out.println(linkSet.size());
    }
}
