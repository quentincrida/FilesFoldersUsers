package com.example.codeclan.FileFolderUser.components;

import com.example.codeclan.FileFolderUser.models.File;
import com.example.codeclan.FileFolderUser.models.Folder;
import com.example.codeclan.FileFolderUser.models.User;
import com.example.codeclan.FileFolderUser.repositories.FileRepository;
import com.example.codeclan.FileFolderUser.repositories.FolderRepository;
import com.example.codeclan.FileFolderUser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
     FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {


        User john = new User("John Tate");
        userRepository.save(john);

        User jane = new User("Jane Fonda");
        userRepository.save(jane);


        Folder trustees = new Folder("Trustees Minutes", jane);
        folderRepository.save(trustees);


        File pdf = new File("Photos", ".pdf", 1000.00, trustees);
        fileRepository.save(pdf);


    }


    }


