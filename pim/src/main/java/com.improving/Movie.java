package com.improving;

public class Movie {

    private final String id;

    private final String title;

    private final String releaseDate;

    private final String profit;

    private final String rating;

    public Movie(String id, String title, String releaseDate, String profit, String rating) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.profit = profit;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getProfit() {
        return profit;
    }

    public String getRating() {
        return rating;
    }
}