package com.improving.bootcamp;

import com.fasterxml.jackson.annotation.JsonView;
import com.improving.bootcamp.api.JsonViews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class SimpleController {

private BookRepository bookRepository;

public SimpleController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
}

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model, Principal principal) {
        model.put("book", new Book("", ""));
        setCommonModelAttributes(model, principal);
        return "home";
    }

    @GetMapping("/book")
    public String book(ModelMap model, @RequestParam Integer id) {
    model.put("book", bookRepository.getBook(id));
    return "book";
    }

    private void setCommonModelAttributes(ModelMap model, Principal principal) {
        model.put("showForm", (principal != null) &&
                principal.getName().equalsIgnoreCase("admin"));
        model.put("message", getMessage());
        model.put("name", (principal!=null) ? principal.getName() : "Bootcamp");
        model.put("books", bookRepository.getBooks());
    }

    @PostMapping("/add")
    public String add(ModelMap model, @Valid @ModelAttribute("book") Book book,
                      BindingResult bindingResult, Principal principal){
        if (bindingResult.hasErrors()) {
            setCommonModelAttributes(model, principal);
            return "home";
        }
        bookRepository.add(book);
        return "redirect:/home";
    }

    private String getMessage() {
        boolean morning = new Random().nextBoolean();
        return (morning) ? "Hello" : "Goodbye";
    }

    @GetMapping("/bad")
    public String badRequest() {
        throw new RuntimeException("Something went wrong");
    }

    @GetMapping("/teapot")
    public String teapot() {
        throw new TeapotException();
    }

    @GetMapping("/")
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String redirect() {
    return "redirect:/home";
    }

    @JsonView(JsonViews.SummaryView.class)
    @GetMapping("/books")
    public List<Book> books() {
    return bookRepository.getBooks();
    }
}
