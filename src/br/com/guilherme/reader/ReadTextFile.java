package br.com.guilherme.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author guilherme
 *
 */
public class ReadTextFile {

	private File file;
	
	public ReadTextFile(File file) {
		this.file = file;
	}
	
	public List<String> notEmptyLines() {
		try {
			List<String> notNullLines = new ArrayList<String>();
			Scanner sc = new Scanner(this.file);
			while (sc.hasNext()) {
				String currentLine = sc.nextLine();
				if (!currentLine.isEmpty()) {
					notNullLines.add(currentLine);
				}
			}
			return notNullLines;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File not found: "+file);
		}
	}
}
