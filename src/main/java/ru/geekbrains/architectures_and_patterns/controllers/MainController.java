package ru.geekbrains.architectures_and_patterns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {


    @GetMapping("/")
    public String showHomePage() {
        return "products";
    }

}