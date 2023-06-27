package com.github.renas.toDoSpringBoot.controller;


import com.github.renas.toDoSpringBoot.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Controller {

    @GetMapping("/")
    public Note getNote(String title, String content) {
        Note note = new Note(UUID.randomUUID(),title,content);
        return note;
    }

}