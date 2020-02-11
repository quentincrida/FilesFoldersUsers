package com.example.codeclan.FileFolderUser.repositories;

import com.example.codeclan.FileFolderUser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
