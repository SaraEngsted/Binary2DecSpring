package com.example.binarytodecspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndeksController {

    @GetMapping("/indeks")
    public String indeks() {
        return "indeks";
    }

}
