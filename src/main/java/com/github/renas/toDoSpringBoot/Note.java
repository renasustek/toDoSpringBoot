package com.github.renas.toDoSpringBoot;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="note", schema="public")
public class Note {
    @Id
    private UUID id;
    @Column(name="title", nullable=false, unique=false)
    private String title;
    @Column(name="content", nullable=false, unique=false)
    private String content;

    public Note(UUID id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Note(){

    }
    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "Title: " + title + " Content: " + content;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
