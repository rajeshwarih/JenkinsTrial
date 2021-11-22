package com.trial.interviews;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Try with Resources was introduced in Java 7 for auto closing resources used
public class TryWithResources {
	
	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rajeshwariHippargi\\Desktop\\assessment.txt"));){
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
		}
	}

}
