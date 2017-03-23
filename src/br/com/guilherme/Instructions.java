package br.com.guilherme;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author guilherme
 *
 */
public class Instructions {

	private List<Instruction> instructions = new ArrayList<Instruction>();
	
	public List<Instruction> getInstructions() {
		return this.instructions;
	}
	
	public Instructions(String string) {
		for (char c: string.toCharArray()) {
			switch (Character.toUpperCase(c)) {
			case 'L': {
				instructions.add(new HeadingLeftInstruction());
				break;
			}
			case 'R': {
				instructions.add(new HeadingRightInstruction());
				break;				
			}
			case 'M': {
				instructions.add(new MoveForwardInstruction());
				break;				
			}
			}
		}
	}

}
