package com.github.renas.toDoSpringBoot;

public class NoteRequest {
    private String title;
    private String content;

    // Getters and setters

    // Constructor
    public NoteRequest() {}

    // Parameterized constructor
    public NoteRequest(String title, String content) {
        this.title = title;
        this.content = content;
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