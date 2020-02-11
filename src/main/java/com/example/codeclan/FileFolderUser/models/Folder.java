package com.example.codeclan.FileFolderUser.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String title;
    private List<File> files;
    private Long id;

    public Folder(String title) {
        this.title = title;
        this.files = new ArrayList<>();
    }

    public Folder() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
