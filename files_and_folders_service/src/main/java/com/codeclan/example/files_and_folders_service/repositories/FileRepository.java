package com.codeclan.example.files_and_folders_service.repositories;

import com.codeclan.example.files_and_folders_service.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
