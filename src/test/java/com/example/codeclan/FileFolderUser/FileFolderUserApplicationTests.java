package com.example.codeclan.FileFolderUser;

import com.example.codeclan.FileFolderUser.models.File;
import com.example.codeclan.FileFolderUser.models.Folder;
import com.example.codeclan.FileFolderUser.models.User;
import com.example.codeclan.FileFolderUser.repositories.FileRepository;
import com.example.codeclan.FileFolderUser.repositories.FolderRepository;
import com.example.codeclan.FileFolderUser.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileFolderUserApplicationTests {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFileObjects(){


		User user = new User("Donald Duck");
		userRepository.save(user);

		Folder folder = new Folder("Trustees Minutes", user);
		folderRepository.save(folder);

		File file = new File("CTB", ".doc", 100.00, folder);
		fileRepository.save(file);
	}

}
