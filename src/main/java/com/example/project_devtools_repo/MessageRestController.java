package com.example.project_devtools_repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @GetMapping("/mesaj")
    public String arataMesaj() {
        return "Acesta este un mesaj!!!!2221";
    }


}
