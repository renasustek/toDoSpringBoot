package com.github.renas.toDoSpringBoot.persistance;


import com.github.renas.toDoSpringBoot.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NoteRepository extends JpaRepository<Note, UUID> {

}
