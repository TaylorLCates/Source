package com.improving.bootcamp;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "somethingBadHappened";
    }
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @ExceptionHandler(TeapotException.class)
    public String exceptionHandler(TeapotException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "somethingBadHappened";
    }

}
