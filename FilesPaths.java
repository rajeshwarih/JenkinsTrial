package com.trial.interviews;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesPaths {
	
	// nio class was introduced in java 7 for latest operations on file system
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:", "Users", "rajeshwariHippargi", "Desktop","assessment.txt");
				
		List<String> lines = Files.readAllLines(path);
		
		for(String line : lines) {
			System.out.println(line);
		}
	
	}

}
