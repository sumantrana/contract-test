package com.sumant.boot.learning.contracttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @GetMapping("/book")
    public Book getBook(){
        return Book.builder().name("TestBook").value(10).build();
    }

}
