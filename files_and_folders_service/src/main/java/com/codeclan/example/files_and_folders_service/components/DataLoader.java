package com.codeclan.example.files_and_folders_service.components;

import com.codeclan.example.files_and_folders_service.models.File;
import com.codeclan.example.files_and_folders_service.models.Folder;
import com.codeclan.example.files_and_folders_service.models.Person;
import com.codeclan.example.files_and_folders_service.repositories.FileRepository;
import com.codeclan.example.files_and_folders_service.repositories.FolderRepository;
import com.codeclan.example.files_and_folders_service.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("!test") //Run every time EXCEPT Tests
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Person person1 = new Person("Johnny Sweden");
        personRepository.save(person1);

        Person person2 = new Person("Marcus Thomson");
        personRepository.save(person2);

        Person person3 = new Person("Big Dan");
        personRepository.save(person3);

        Folder folder1 = new Folder("My Documents", person1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("My Documents", person2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("My Documents", person3);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("My Pictures", person1);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("My Music", person1);
        folderRepository.save(folder5);

        File file1 = new File("boring_homework", ".java", 3, folder1);
        fileRepository.save(file1);

        File file2 = new File("bangingTune", ".mp3", 4, folder5);
        fileRepository.save(file2);

        File file3 = new File("budget", ".xl",2, folder1);
        fileRepository.save(file3);

    }
}
