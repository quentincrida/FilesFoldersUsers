package com.example.codeclan.FileFolderUser.controllers;

import com.example.codeclan.FileFolderUser.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    @Autowired
    private FileRepository fileRepository;

    @GetMapping(value = "/files/")
    public
}
