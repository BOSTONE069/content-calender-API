package com.bostone.contentcalender.repository;


import com.bostone.contentcalender.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRespository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRespository() {

    }

    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id).findFirst());
    }
}
