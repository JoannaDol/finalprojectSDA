package com.example.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentController {

    @GetMapping("/rent")
    public String getRentPage() {
        return "rent";
    }

}
