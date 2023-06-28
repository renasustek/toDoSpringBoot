package com.github.renas.toDoSpringBoot.controller;


import com.github.renas.toDoSpringBoot.Note;
import com.github.renas.toDoSpringBoot.NoteRequest;
import com.github.renas.toDoSpringBoot.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ToDoController {


    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/")
    public void getNote(@RequestParam("title") String title, @RequestParam("content") String content) {
        Note note = new Note(UUID.randomUUID(),title,content);
        toDoService.save(note);
    }

//FOR NOW REMOVE AFTER TESTING
    @PostMapping("/")
    public void createNote(@RequestBody NoteRequest noteRequest) {
        Note note = new Note(UUID.randomUUID(), noteRequest.getTitle(), noteRequest.getContent());
        toDoService.save(note);
    }
}