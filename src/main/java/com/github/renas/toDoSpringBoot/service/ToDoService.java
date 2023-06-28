package com.github.renas.toDoSpringBoot.service;

import com.github.renas.toDoSpringBoot.Note;
import com.github.renas.toDoSpringBoot.persistance.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ToDoService {

    private final NoteRepository noteRepository;
    @Autowired
    public ToDoService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }


    public void save(Note note){
        noteRepository.save(note);
    }

    public void Delete(UUID uuid){
        noteRepository.deleteById(uuid);
    }

    public void loadList(){
        noteRepository.findAll();
    }

    public void update(UUID uuid, String updatedTitle, String updatedContent){
        Note noteToUpdate = noteRepository.getReferenceById(uuid);
        noteToUpdate.setTitle(updatedTitle);
        noteToUpdate.setContent(updatedContent);
    }

}