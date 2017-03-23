package br.com.guilherme.runner;

import java.io.File;
import java.util.List;

import br.com.guilherme.Instructions;
import br.com.guilherme.Plateau;
import br.com.guilherme.Position;
import br.com.guilherme.Rover;
import br.com.guilherme.UpperRightCoordinate;
import br.com.guilherme.reader.ReadTextFile;



public class Run {

	/**
	 * @param args
	 * 
	 * To run: java -jar "filename.txt"
	 * 
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			throw new IllegalArgumentException("You must specify a text file to test that.");
		}
		List<String> lines = new ReadTextFile(new File(args[0])).notEmptyLines();
		if (lines.size() < 3) {
			throw new IllegalArgumentException("Your test file should be three or more lines.");
		}
		UpperRightCoordinate coordinate = new UpperRightCoordinate(lines.get(0));
		Plateau plateau = new Plateau(coordinate.getX(), coordinate.getY());
		
		boolean isPosition = true;
		Position position = null;
		for (int i = 1; i < lines.size(); i++) {
			if (isPosition) {
				position = new Position(lines.get(i));
				isPosition = false;
			} else {
				//create a robot and print its positions
				new Rover()
					.landOn(plateau)
				    .atCoordinate(position.getX(), position.getY())
					.atOrientation(position.getCardinalPoint())
					.processInstructions(new Instructions(lines.get(i)))
					.printPosition();
				
				position = null;
				isPosition = true;
			}
			
		}
	}

}
