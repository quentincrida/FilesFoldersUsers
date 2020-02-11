package com.example.codeclan.FileFolderUser.repositories;

import com.example.codeclan.FileFolderUser.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
