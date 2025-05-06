package com.project.dijksra_website;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String index(){
        return "index";
    }
}
