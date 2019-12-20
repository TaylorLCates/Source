package com.improving;

import com.improving.MovieRepository;
import com.improving.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SimpleApiController {

    //private final DrankRepository drankRepository;
    private final MovieRepository movieRepository;

//    public SimpleApiController(DrankRepository drankRepository) {
//        this.drankRepository = drankRepository;
//    }

    public SimpleApiController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public List<Movie> movies() {
        return movieRepository.getMovies();
    }

//    @GetMapping("/dranks")
//    public List<Dranks> dranks() {
//        return drankRepository.getDranks();
//    }
//
//    @GetMapping("/dranks/{id}")
//    public Dranks dranks(@PathVariable Integer id) {
//        return drankRepository.getDrank(id);
//    }
//
//    @PutMapping("/drank")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Dranks addDrank(@Valid @RequestBody Dranks drank) {
//        drankRepository.add(drank);
//        return drank;
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> errorHandler(MethodArgumentNotValidException e){
        Map<String, String> errors = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach(fieldError -> {
            errors.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
