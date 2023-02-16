package br.com.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexControlller {

    @GetMapping("/lista")
    public ModelAndView getList(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

}
