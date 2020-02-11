package com.example.codeclan.FileFolderUser;

import com.example.codeclan.FileFolderUser.models.File;
import com.example.codeclan.FileFolderUser.models.Folder;
import com.example.codeclan.FileFolderUser.repositories.FileRepository;
import com.example.codeclan.FileFolderUser.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileFolderUserApplicationTests {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFileObjects(){

		Folder folder = new Folder("Trustees Minutes");
		folderRepository.save(folder);

		File file = new File("CTB", ".doc", 100.00, folder);
		fileRepository.save(file);
	}

}
