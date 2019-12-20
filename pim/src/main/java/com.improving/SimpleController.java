package com.improving;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class SimpleController {

    private DrankRepository drankRepository = new DrankRepository();
    private QuoteClient quoteClient;

    public SimpleController(QuoteClient quoteClient) {
        this.quoteClient = quoteClient;
    }

    @RequestMapping("/home")
    public String home(ModelMap model) {
       model.put("dranks", drankRepository.getDranks());
       model.put("quote", quoteClient.quoteSearch());
        return "home";
    }

    @RequestMapping("/product")
    public String product(ModelMap model, @RequestParam Integer id) {
        model.put("dranks", drankRepository.getDranks());
        model.put("drank", drankRepository.getDrank(id));
        return "productPage";
    }

    @RequestMapping("/form")
    public String form(ModelMap model, @Valid @ModelAttribute("drank") Dranks drank, BindingResult bindingResult){
        model.put("drank", new Dranks("","","", ""));
        return "formPage";
    }

    @PostMapping("/add")
    public String add(ModelMap model, @Valid @ModelAttribute("drank") Dranks drank, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "formPage";
        }
        drankRepository.add(drank);
        return "redirect:/home";
    }
}



