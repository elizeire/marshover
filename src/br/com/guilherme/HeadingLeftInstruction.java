package br.com.guilherme;
/**
 * 
 * @author guilherme
 *
 */
public class HeadingLeftInstruction implements Instruction {

	private Rover rover;
	
	public void bind(Rover rover) {
		this.rover = rover;
	}

	public void execute() {
		rover.headingLeft();
	}

}
