package com.improving;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class MovieRepository {

    private final List<Movie> movies = new ArrayList<>();

    public MovieRepository() {
        movies.add(new Movie("1", "fiddles", "1999", "$5", "4.5" ));
        movies.add(new Movie("2", "fiddlessticks", "1999", "$5", "4.5" ));
        movies.add(new Movie("3", "fuds", "1999", "$5", "4.5" ));
        movies.add(new Movie("4", "fiduccah", "1999", "$5", "4.5" ));
        movies.add(new Movie("5", "fiddlers", "1999", "$5", "4.5" ));
        movies.add(new Movie("6", "fibbo", "1999", "$5", "4.5" ));
        movies.add(new Movie("7", "federali", "1999", "$5", "4.5" ));
        movies.add(new Movie("8", "float", "1999", "$5", "4.5" ));
        movies.add(new Movie("9", "flugs", "1999", "$5", "4.5" ));
        movies.add(new Movie("10", "figgaro", "1999", "$5", "4.5" ));
    }

    public List<Movie> getMovies(){
        return Collections.unmodifiableList(movies);
    }

    public Movie getMovie(Integer id) {
        return movies.get(id - 1);
    }

}