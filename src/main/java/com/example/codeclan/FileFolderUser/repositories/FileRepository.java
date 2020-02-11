package com.example.codeclan.FileFolderUser.repositories;

import com.example.codeclan.FileFolderUser.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

}
