package com.bostone.contentcalender.controller;


import com.bostone.contentcalender.model.Content;
import com.bostone.contentcalender.repository.ContentCollectionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRespository repository;

    @Autowired
    public ContentController(ContentCollectionRespository repository) {
        this.repository = repository;
    }


    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }
}
