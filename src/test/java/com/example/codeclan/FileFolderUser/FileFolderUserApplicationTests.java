package com.example.codeclan.FileFolderUser;

import com.example.codeclan.FileFolderUser.models.File;
import com.example.codeclan.FileFolderUser.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileFolderUserApplicationTests {

	@Autowired
	private FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFileObjects(){
		File file = new File("CTB", ".doc", 100.00);
		fileRepository.save(file);
	}

}
