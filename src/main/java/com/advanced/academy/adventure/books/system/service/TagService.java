package com.advanced.academy.adventure.books.system.service;


import com.advanced.academy.adventure.books.system.model.Tag;
import com.advanced.academy.adventure.books.system.model.adventure.Adventure;
import com.advanced.academy.adventure.books.system.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TagService {
    private final TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public void createOrUpdate(Tag tag) {
    tagRepository.save(tag);
    }

    public Tag getTagById(Integer tagId){
        Tag tag = null;
        Optional<Tag> result = tagRepository.findById(tagId);
        if(result.isPresent()) {
            tag = result.get();
        }

        return tag;
    }

    public List<Tag> getAllTagsByAdventureId(Integer adventureId){
        List<Tag> tags = new ArrayList<>();
        Adventure adventure = tagRepository.getReference(Adventure.class, adventureId);
        //todo introduce method that finds by adventure id
        Optional<List<Tag>> result = tagRepository.findAllByAdventure(adventure);
        if (result.isPresent()) {
            tags.addAll(result.get());
        }
        return tags;

    }

    public List<Tag> getAllTags(){
        List<Tag> tags = new ArrayList<>();
        Iterable<Tag> result = tagRepository.findAll();
        if(null != result) {
            result.forEach(tag -> tags.add(tag));
        }

        return tags;
    }


}   //end bracket
